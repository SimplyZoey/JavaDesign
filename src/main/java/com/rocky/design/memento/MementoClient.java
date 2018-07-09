/**
 * Author:   shitian
 * Date:     2018/7/9 17:40
 * Description:
 */
package com.rocky.design.memento;

/**
 * 〈备忘录模式〉
 *  扩展：
 *  1.CareTaker中可以使用map来保存备份，实现多备份
 *
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class MementoClient {

    public static void main(String[] args) {
        //声明出主角
        Boy boy = new Boy();
        CareTaker taker = new CareTaker();
        //初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
        //需要记录下当前状态呀
        taker.setMemento(boy.createMementor());

        //男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());

        //追女孩失败，恢复原状
        boy.restoreMemento(taker.getMemento());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
