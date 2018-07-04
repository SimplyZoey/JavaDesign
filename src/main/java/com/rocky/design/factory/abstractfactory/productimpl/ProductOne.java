/**
 * Author:   shitian
 * Date:     2018/7/4 9:26
 * Description:
 */
package com.rocky.design.factory.abstractfactory.productimpl;

import com.rocky.design.factory.abstractfactory.Product;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class ProductOne implements Product {

    @Override
    public void doSomething() {
        System.out.println("i am product one.");
    }
}
