/**
 * Author:   shitian
 * Date:     2018/7/4 9:14
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
public abstract class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种肤色是白色");
    }

    @Override
    public void talk() {
        System.out.println("白人讲话,一般是单字节");
    }
}
