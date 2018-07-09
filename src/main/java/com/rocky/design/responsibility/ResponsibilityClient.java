/**
 * Author:   shitian
 * Date:     2018/7/6 11:44
 * Description:
 */
package com.rocky.design.responsibility;

import com.rocky.design.responsibility.impl.Father;
import com.rocky.design.responsibility.impl.Husband;
import com.rocky.design.responsibility.impl.Son;
import com.rocky.design.responsibility.impl.Women;

import java.util.ArrayList;
import java.util.Random;

/**
 * 〈责任链模式〉
 * 优点：
 * 1：将请求与处理分开，请求不用知道谁处理的，处理者也不用知道请求的全貌，解耦
 *
 * 缺点：
 * 1.性能问题：每次都需要从链头开始判断
 * 2.调试时候可能会比较复杂
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public class ResponsibilityClient {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : arrayList) {
            father.handlerMessage(women);
        }
    }
}
