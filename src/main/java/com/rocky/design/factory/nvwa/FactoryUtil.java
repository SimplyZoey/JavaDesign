/**
 * Author:   shitian
 * Date:     2018/7/4 14:18
 * Description:
 */
package com.rocky.design.factory.nvwa;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class FactoryUtil {
    private static volatile Map<String,HumanFactory> factoryMap = new HashMap<>();
    private static String MALE_FACTORY_INSTANCE = "MALE_FACTORY_INSTANCE";
    private static String FEMALE_FACTORY_INSTANCE = "FEMALE_FACTORY_INSTANCE";

    public static HumanFactory getMaleFactory(){
        HumanFactory factory = null;
        if(factoryMap.containsKey(MALE_FACTORY_INSTANCE)){
            factory = factoryMap.get(MALE_FACTORY_INSTANCE);
        }else{
            factory = new MaleFactory();
            factoryMap.put(MALE_FACTORY_INSTANCE,factory);
        }
        return factory;
    }

    public static HumanFactory getFemaleFactory(){
        HumanFactory factory = null;
        if(factoryMap.containsKey(FEMALE_FACTORY_INSTANCE)){
            factory = factoryMap.get(FEMALE_FACTORY_INSTANCE);
        }else{
            factory = new FemaleFactory();
            factoryMap.put(FEMALE_FACTORY_INSTANCE,factory);
        }
        return factory;
    }

}
