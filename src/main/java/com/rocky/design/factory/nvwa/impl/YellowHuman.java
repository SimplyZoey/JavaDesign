/**
 * Author:   shitian
 * Date:     2018/7/4 9:13
 * Description:
 */
package com.rocky.design.factory.nvwa.impl;

import com.rocky.design.factory.nvwa.Human;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public abstract class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种肤色是黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种讲话,一般是双字节");
    }
}
