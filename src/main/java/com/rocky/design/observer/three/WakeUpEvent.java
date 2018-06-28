/**
 * Author:   shitian
 * Date:     2018/6/28 10:16
 * Description: 事件通知类
 */
package com.rocky.design.observer.three;

import com.rocky.design.observer.SuperBaby;

/**
 * 〈事件通知类〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class WakeUpEvent {
    private boolean FoodTime;
    private SuperBaby baby;

    public WakeUpEvent(boolean FoodTime,SuperBaby baby){
        this.FoodTime = FoodTime;
        this.baby = baby;
    }

    public boolean isFoodTime(){
        return this.FoodTime;
    }

    public void setFoodTime(boolean FoodTime){
        this.FoodTime = FoodTime;
    }

    public SuperBaby getBaby() {
        return baby;
    }

    public void setBaby(SuperBaby baby) {
        this.baby = baby;
    }
}
