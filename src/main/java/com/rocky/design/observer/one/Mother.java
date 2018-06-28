/**
 * Author:   shitian
 * Date:     2018/6/28 9:57
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
public class Mother implements Runnable{
    private Baby baby;

    public Mother(Baby baby){
        this.baby = baby;
    }

    private void feedBaby(){
        System.out.println("开始喂食...");
    }

    @Override
    public void run() {
        System.out.println("等待5s孩子睡醒...");
        //自旋等待小孩醒来
        while(true){
            if(baby.isWakeUp()){
                feedBaby();
                break;
            }
        }
    }
}
