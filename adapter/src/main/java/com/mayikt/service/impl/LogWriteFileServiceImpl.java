package com.mayikt.service.impl;

import com.mayikt.entity.LogBean;
import com.mayikt.service.LogWriteFileService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class LogWriteFileServiceImpl implements LogWriteFileService {

    @Override
    public void logWriteFile() {
        log.info(">>>将日志写入文件中...");
    }

    @Override
    public List<LogBean> readLogFile() {
        LogBean log1 = new LogBean();
        log1.setLogId("0001");
        log1.setLogText("Tomcat启动成功..");

        LogBean log2 = new LogBean();
        log2.setLogId("0002");
        log2.setLogText("Jetty启动成功..");

        List<LogBean> listArrayList = new ArrayList<LogBean>();
        listArrayList.add(log1);
        listArrayList.add(log2);
        log.info(">>>读取log文件...");
        return listArrayList;
    }


}