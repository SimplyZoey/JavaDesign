/**
 * Author:   shitian
 * Date:     2018/7/4 9:12
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
public abstract class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种肤色是黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人讲话一般人听不懂");
    }
}
