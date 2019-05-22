package com.mayikt.mapper;

import com.mayikt.mapper.entity.GatewayHandlerEntity;
import org.apache.ibatis.annotations.Select;

public interface GatewayHandlerMapper {

    /**
     * 获取第一个GatewayHandler
     *
     * @return
     */
    @Select("SELECT id as id, handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid  FROM gateway_handler WHERE  prev_handler_id is null")
    public GatewayHandlerEntity getFirstGatewayHandler();

    @Select("SELECT id as id , handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid   FROM gateway_handler WHERE  handler_id=#{handlerId}")
    public GatewayHandlerEntity getByHandler(String handlerId);

}

