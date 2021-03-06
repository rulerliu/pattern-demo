package com.mayikt.service;

import com.mayikt.handler.GatewayHandler;
import com.mayikt.mapper.GatewayHandlerMapper;
import com.mayikt.mapper.entity.GatewayHandlerEntity;
import com.mayikt.utils.SpringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 4:53
 * @version: V1.0
 */
@Service
public class GatewayHandlerService {

    @Autowired
    private GatewayHandlerMapper gatewayHandlerMapper;
    private GatewayHandler firstGatewayHandler;

    /**
     * 获取数据库第一个handeler封装
     *
     * @return
     */
    public GatewayHandler getFirstGatewayHandler() {
        if (firstGatewayHandler != null) {
            return firstGatewayHandler;
        }

        // 1.从数据库中查询地址hanlder
        GatewayHandlerEntity firstGatewayHandlerEntity = gatewayHandlerMapper.getFirstGatewayHandler();
        if (firstGatewayHandlerEntity == null) {
            return null;
        }

        // 2.获取springboot注入容器id
        String handlerId = firstGatewayHandlerEntity.getHandlerId();
        GatewayHandler firstGatewayHandler = SpringUtils.getBean(handlerId, GatewayHandler.class);

        // 3.获取下一个handler容器beanid
        String nextHandlerId = firstGatewayHandlerEntity.getNextHandlerId();

        // 4. 记录当前循环hanlder对象
        GatewayHandler tempGatewayHandler = firstGatewayHandler;
        while (!StringUtils.isEmpty(nextHandlerId)) {
            // 5.从springboot容器获取下一个handerl对象
            GatewayHandler nextGatewayHandler = SpringUtils.getBean(nextHandlerId, GatewayHandler.class);
            tempGatewayHandler.setNextGatewayHandler(nextGatewayHandler);
            // 6.设置下一个nextHandlerId
            GatewayHandlerEntity nextGatewayHandlerEntity = gatewayHandlerMapper.getByHandler(nextHandlerId);
            if (nextGatewayHandlerEntity == null) {
                break;
            }
            nextHandlerId = nextGatewayHandlerEntity.getNextHandlerId();
            tempGatewayHandler = nextGatewayHandler;
        }
        this.firstGatewayHandler = firstGatewayHandler;
        return firstGatewayHandler;
    }

}
