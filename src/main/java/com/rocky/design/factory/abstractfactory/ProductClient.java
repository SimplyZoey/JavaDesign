/**
 * Author:   shitian
 * Date:     2018/7/4 9:42
 * Description:
 */
package com.rocky.design.factory.abstractfactory;

import com.rocky.design.factory.abstractfactory.factoryimpl.OneFactory;
import com.rocky.design.factory.abstractfactory.productimpl.ProductOne;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class ProductClient {

    public static void main(String[] args){
        AbstractFactory factory = new OneFactory();
        ProductOne product = factory.createProduct(ProductOne.class);
        product.doSomething();
    }
}
