package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

    public void logService() {
        log.info("第一个模块:日志的收集与打印...");
    }
}
