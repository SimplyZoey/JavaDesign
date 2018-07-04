/**
 * Author:   shitian
 * Date:     2018/7/4 14:31
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
public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    //定义final，防止模板方法被重写
    final void run(){
        this.start();
        this.engineBoom();
        if(isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法，由子类控制父类的模板方法执行逻辑
     * @return
     */
    protected boolean isAlarm(){
        return true;
    }
}
