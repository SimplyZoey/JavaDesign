/**
 * Author:   shitian
 * Date:     2018/6/28 10:08
 * Description:
 */
package com.rocky.design.observer.two;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class BabyTwo implements Runnable {
    private MotherTwo mother;

    public BabyTwo(MotherTwo mother){
        this.mother = mother;
    }

    @Override
    public void run() {
        try {
            System.out.println("孩子开始睡觉...");
            Thread.sleep(5000);
            System.out.println("孩子睡醒，通知母亲喂食...");
            mother.feed();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
