package com.mayikt.service;

import com.mayikt.entity.LogBean;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:50
 * @version: V1.0
 */
public interface LogWriteDbService {

    /**
     * 将日志写入到DB中
     */
    void writeDbFile(LogBean logBean);
}
