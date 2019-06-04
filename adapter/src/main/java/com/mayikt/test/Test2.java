package com.mayikt.test;

import com.mayikt.adapter.LogAdapter;
import com.mayikt.service.impl.LogWriteFileServiceImpl;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/4 0004 下午 4:41
 * @version: V1.0
 */
public class Test2 {

    public static void main(String[] args) {
        LogAdapter logAdapter = new LogAdapter(new LogWriteFileServiceImpl());

        logAdapter.writeDbFile(null);

    }

}
