/**
 * Author:   shitian
 * Date:     2018/6/28 10:04
 * Description:
 */
package com.rocky.design.observer;

import com.rocky.design.observer.four.BabyFour;
import com.rocky.design.observer.four.FatherTwo;
import com.rocky.design.observer.four.MotherFour;
import com.rocky.design.observer.impl.HanFeiZi;
import com.rocky.design.observer.impl.LiSi;
import com.rocky.design.observer.impl.WangSi;
import com.rocky.design.observer.one.Baby;
import com.rocky.design.observer.one.Mother;
import com.rocky.design.observer.three.BabyThree;
import com.rocky.design.observer.three.Father;
import com.rocky.design.observer.three.MotherThree;
import com.rocky.design.observer.two.BabyTwo;
import com.rocky.design.observer.two.MotherTwo;

/**
 * 〈观察者模式〉
 * 优点：
 * 1.观察者与被观察者为抽象耦合，便于扩展
 * 2.建立一套触发模式，观察者模式可以完美的实现一套触发链模式
 *
 * 缺点：
 * 1.考虑开发/运行效率，特别是观察者比较多的情况
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public class ObserverMain {

    public static void main(String[] args){
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new WangSi());
        //然后我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
        //韩非子娱乐了
        hanFeiZi.haveFun();
    }


    /**
     * mother线程一直监控baby线程醒过来，逻辑由mother控制
     */
    public static void testOne() {
        Baby baby = new Baby();
        Thread babyThread = new Thread(baby);
        Thread mother = new Thread(new Mother(baby));
        babyThread.start();
        mother.start();
    }

    /**
     * baby线程醒来后，通知mother来喂食，逻辑由baby控制
     */
    public static void testTwo() {
        MotherTwo mother = new MotherTwo();
        Thread babyThread = new Thread(new BabyTwo(mother));
        babyThread.start();
    }

    /**
     * 增加一个paly的业务逻辑，不过所有的逻辑控制还是由baby控制
     * 代码复用性差，来一个逻辑，就需要修改控制类
     */
    public static void testThree(){
        MotherThree mother = new MotherThree();
        Father father = new Father();
        Thread baby = new Thread(new BabyThree(father,mother));
        baby.start();
    }

    /**
     * 将所有需要baby通知的监听事件统一管理，baby一次性统一通知
     */
    public static void testFour(){
        BabyFour baby = new BabyFour();
        baby.addListener(new MotherFour());
        baby.addListener(new FatherTwo());
        Thread babyThread = new Thread(baby);
        babyThread.start();
    }

}
