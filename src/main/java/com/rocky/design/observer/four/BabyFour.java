/**
 * Author:   shitian
 * Date:     2018/6/28 10:40
 * Description:
 */
package com.rocky.design.observer.four;

import com.rocky.design.observer.SuperBaby;
import com.rocky.design.observer.three.WakeUpEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class BabyFour implements Runnable,SuperBaby {
    private List<WakeUpListener> wakeUpListeners = new ArrayList<>();

    public void addListener(WakeUpListener listener){
        wakeUpListeners.add(listener);
    }

    public void wakeUp(){
        for(WakeUpListener listener : wakeUpListeners){
            //所有监听事件统一存放，然后统一调用
            listener.action2WakenUp(new WakeUpEvent(false,this));
        }
    }

    @Override
    public void run() {
        try {
            //睡5s然后醒过来
            System.out.println("孩子开始睡觉...");
            Thread.sleep(5000);
            System.out.println("孩子睡醒...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wakeUp();
    }
}
