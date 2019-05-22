package com.mayikt.event;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 2:31
 * @version: V1.0
 */
public class OrderMessageEvent extends ApplicationEvent {

    /**
     * 群发消息的内容
     */
    private JSONObject jsonObject;

    public OrderMessageEvent(Object source, JSONObject jsonObject) {
        super(source);
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

}
