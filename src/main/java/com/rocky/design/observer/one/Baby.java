/**
 * Author:   shitian
 * Date:     2018/6/28 9:53
 * Description:
 */
package com.rocky.design.observer.one;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class Baby implements Runnable{
    private volatile boolean wakeUp = false;

    private void wakeUp(){
        this.wakeUp = true;
    }

    public boolean isWakeUp(){
        return this.wakeUp;
    }


    @Override
    public void run() {
        try {
            //睡5s然后醒过来
            System.out.println("孩子开始睡觉...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wakeUp();
    }
}
