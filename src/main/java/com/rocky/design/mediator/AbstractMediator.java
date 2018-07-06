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

    //由于是子类构造函数触发父类构造函数，所以父类中的this指的是子类对象
    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objects);
}
