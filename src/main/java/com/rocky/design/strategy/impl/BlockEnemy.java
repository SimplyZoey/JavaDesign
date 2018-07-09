/**
 * Author:   shitian
 * Date:     2018/7/9 14:02
 * Description:
 */
package com.rocky.design.strategy.impl;

import com.rocky.design.strategy.IStrategy;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class BlockEnemy implements IStrategy {
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
