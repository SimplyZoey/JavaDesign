/**
 * Author:   shitian
 * Date:     2018/6/28 10:27
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
public class Father {
    public void play(WakeUpEvent event){
        if(!event.isFoodTime()){
            System.out.println("带出去玩...");
        }
    }
}
