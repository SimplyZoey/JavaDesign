/**
 * Author:   shitian
 * Date:     2018/7/4 9:25
 * Description:
 */
package com.rocky.design.factory.abstractfactory;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public interface AbstractFactory {

    <T extends Product> T createProduct(Class<T> c);

}

