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
public class MotherFour implements WakeUpListener {

    @Override
    public void action2WakenUp(WakeUpEvent wakeUpEvent) {
        if(wakeUpEvent.isFoodTime()) {
            System.out.println("开始喂食...");
        }else {
            System.out.println("还没到饭点，起开...");
        }
    }
}
