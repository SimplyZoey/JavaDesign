/**
 * Author:   shitian
 * Date:     2018/7/4 15:29
 * Description:
 */
package com.rocky.design.build;

import java.util.List;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class BMWBuilder extends CarBuilder {
    private CarModel bmw = new BMWModel();

    @Override
    void setSequence(List<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return bmw;
    }
}
