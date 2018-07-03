/**
 * Author:   shitian
 * Date:     2018/7/3 11:40
 * Description:
 */
package com.rocky.design.single;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/3
 * @since 1.0.0
 */
public class SingletonDemo1 {
    private volatile static SingletonDemo1 instance = null;

    private SingletonDemo1(){

    }

    public static SingletonDemo1 getInstance(){
        if(instance == null){
            createInstance();
        }
        return instance;
    }

    private static void createInstance(){
        synchronized (SingletonDemo1.class){
            if(instance == null){
                instance = new SingletonDemo1();
            }
        }
    }
}
