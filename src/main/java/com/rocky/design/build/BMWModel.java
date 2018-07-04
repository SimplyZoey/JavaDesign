/**
 * Author:   shitian
 * Date:     2018/7/4 15:01
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
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马发动...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎启动...");
    }
}
