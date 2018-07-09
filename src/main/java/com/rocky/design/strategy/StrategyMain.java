/**
 * Author:   shitian
 * Date:     2018/7/9 14:04
 * Description:
 */
package com.rocky.design.strategy;

import com.rocky.design.strategy.impl.BackDoor;
import com.rocky.design.strategy.impl.BlockEnemy;
import com.rocky.design.strategy.impl.GivenGreenLight;

/**
 * 〈策略模式〉
 * 优点：
 * 1.策略可以横向扩展，并且能随意替换
 * 2.避免使用多重if/else判断
 *
 * 缺点：
 * 1.策略类过多，可能导致类爆炸
 * 2.每个策略都需要对外暴露，即外部必须知道每个策略的逻辑
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class StrategyMain {

    public static void main(String[] args){
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println("=====================");

        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行了第二个锦囊
        System.out.println("=====================");

        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("=====================");
    }
}
