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
public class BackDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
