/**
 * Author:   shitian
 * Date:     2018/6/28 10:39
 * Description:
 */
package com.rocky.design.observer.four;

import com.rocky.design.observer.three.WakeUpEvent;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class FatherTwo implements WakeUpListener {

    @Override
    public void action2WakenUp(WakeUpEvent wakeUpEvent) {
        if(!wakeUpEvent.isFoodTime()) {
            System.out.println("带出去玩...");
        }else{
            System.out.println("带不出去，要吃饭...");
        }
    }
}
