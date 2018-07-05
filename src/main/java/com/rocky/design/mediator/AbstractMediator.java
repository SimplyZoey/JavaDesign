/**
 * Author:   shitian
 * Date:     2018/7/5 15:59
 * Description:
 */
package com.rocky.design.mediator;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }

    public abstract void execute(String str, Object... objects);
}
