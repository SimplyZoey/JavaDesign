/**
 * Author:   shitian
 * Date:     2018/6/28 10:26
 * Description:
 */
package com.rocky.design.observer.three;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class MotherThree {

    public void feedBaby(WakeUpEvent event){
        if(event.isFoodTime()) {
            System.out.println("开始喂食...");
        }
    }
}
