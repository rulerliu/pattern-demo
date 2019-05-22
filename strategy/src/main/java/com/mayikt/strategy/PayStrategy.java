package com.mayikt.strategy;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/5/22 0022 下午 3:09
 * @version: V1.0
 */
public interface PayStrategy {

    /**
     *  策略模式共同算法的骨架
     * @return
     */
    String toPayHtml();

}
