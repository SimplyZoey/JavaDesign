/**
 * Author:   shitian
 * Date:     2018/7/9 16:00
 * Description:
 */
package com.rocky.design.observer;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public interface Observable {
    //增加一个观察者
    void addObserver(Observer observer);
    //删除一个观察者
    void deleteObserver(Observer observer);
    //既然要观察，我发生改变了他也应该有所动作，通知观察者
    void notifyObservers(String context);
}

