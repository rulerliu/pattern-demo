package com.mayikt.adapter;

import com.mayikt.entity.LogBean;
import com.mayikt.service.LogWriteDbService;
import com.mayikt.service.LogWriteFileService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:47
 * @version: V1.0
 */
@Slf4j
public class LogAdapter implements LogWriteDbService {

    private LogWriteFileService logWriteFileService;

    public LogAdapter(LogWriteFileService logWriteFileService) {
        this.logWriteFileService = logWriteFileService;
    }

    @Override
    public void writeDbFile(LogBean logBean) {
        // 1.从文件中读取日志文件
        List<LogBean> logBeans = logWriteFileService.readLogFile();
        logBeans.add(logBean);

        // 2.写入到本地文件中
        logWriteFileService.logWriteFile();

        // 3.写入到数据库中
        log.info(">>>将数据写入到DB中..");

    }
}
