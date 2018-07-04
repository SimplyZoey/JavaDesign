/**
 * Author:   shitian
 * Date:     2018/7/4 15:02
 * Description:
 */
package com.rocky.design.build;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰发动...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎启动...");
    }
}
