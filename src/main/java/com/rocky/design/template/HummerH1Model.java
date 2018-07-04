/**
 * Author:   shitian
 * Date:     2018/7/4 14:33
 * Description:
 */
package com.rocky.design.template;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class HummerH1Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎启动...");
    }

    @Override
    protected boolean isAlarm(){
        return false;
    }
}
