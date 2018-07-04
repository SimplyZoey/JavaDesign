/**
 * Author:   shitian
 * Date:     2018/7/4 15:13
 * Description:
 */
package com.rocky.design.build;

import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class CarClient {
    public static void main(String[] args) {
        Director director = new Director();
        CarModel benz1 = director.getABenzModel();
        benz1.run();
        CarModel benz2 = director.getBBenzModel();
        benz2.run();

        CarModel bmw1 = director.getABMWModel();
        bmw1.run();
        CarModel bmw2 = director.getBBMWModel();
        bmw2.run();
    }

}
