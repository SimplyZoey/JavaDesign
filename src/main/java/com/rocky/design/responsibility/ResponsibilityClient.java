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
 * 〈〉
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
