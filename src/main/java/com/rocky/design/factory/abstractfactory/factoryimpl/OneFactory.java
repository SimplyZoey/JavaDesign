/**
 * Author:   shitian
 * Date:     2018/7/4 9:33
 * Description:
 */
package com.rocky.design.factory.abstractfactory.factoryimpl;

import com.rocky.design.factory.abstractfactory.AbstractFactory;
import com.rocky.design.factory.abstractfactory.Product;
import com.rocky.design.factory.abstractfactory.productimpl.ProductOne;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class OneFactory implements AbstractFactory {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        ProductOne product = null;
        try {
            product = (ProductOne) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
