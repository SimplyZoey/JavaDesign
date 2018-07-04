/**
 * Author:   shitian
 * Date:     2018/7/4 15:28
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
public class BenzBuilder extends CarBuilder {
    private CarModel benz = new BenzModel();

    @Override
    void setSequence(List<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return benz;
    }
}
