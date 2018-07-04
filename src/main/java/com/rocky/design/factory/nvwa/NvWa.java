/**
 * Author:   shitian
 * Date:     2018/7/4 9:15
 * Description:
 */
package com.rocky.design.factory.nvwa;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = FactoryUtil.getMaleFactory();
        Human male = maleFactory.createYellowHuman();
        HumanFactory femaleFactory = FactoryUtil.getFemaleFactory();
        Human female = femaleFactory.createYellowHuman();
        male.getColor();
        male.talk();
        male.getSex();
        female.getColor();
        female.talk();
        female.getSex();
    }

}
