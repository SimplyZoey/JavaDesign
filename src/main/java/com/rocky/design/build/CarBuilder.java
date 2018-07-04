/**
 * Author:   shitian
 * Date:     2018/7/4 15:27
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
public abstract class CarBuilder {

    abstract void setSequence(List<String> sequence);

    abstract CarModel getCarModel();
}
