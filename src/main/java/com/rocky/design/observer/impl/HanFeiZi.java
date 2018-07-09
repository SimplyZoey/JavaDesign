/**
 * Author:   shitian
 * Date:     2018/7/9 15:45
 * Description:
 */
package com.rocky.design.observer.impl;

import com.rocky.design.observer.IHanFeiZi;
import com.rocky.design.observer.Observable;
import com.rocky.design.observer.Observer;

import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class HanFeiZi implements IHanFeiZi,Observable {
    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<>();
    //增加观察者
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }
    //删除观察者
    public void deleteObserver(Observer observer){
        this.observerList.remove(observer);
    }
    //通知所有的观察者
    public void notifyObservers(String context){
        for(Observer observer:observerList){
            observer.update(context);
        }
    }

    //韩非子要吃饭了
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        notifyObservers("韩非子在吃饭");
    }
    //韩非子开始娱乐了
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        notifyObservers("韩非子在娱乐");
    }


}
