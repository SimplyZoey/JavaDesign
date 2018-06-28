/**
 * Author:   shitian
 * Date:     2018/6/28 10:17
 * Description:
 */
package com.rocky.design.observer.three;

import com.rocky.design.observer.SuperBaby;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class BabyThree implements Runnable ,SuperBaby{
    private Father father;
    private MotherThree mother;

    public BabyThree(Father father,MotherThree mother){
        this.father = father;
        this.mother = mother;
    }

    public void wakeUp(){
        mother.feedBaby(new WakeUpEvent(true,this));
        father.play(new WakeUpEvent(false,this));
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("孩子开始睡觉...");
                Thread.sleep(5000);
                System.out.println("孩子睡醒...");
                wakeUp();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
