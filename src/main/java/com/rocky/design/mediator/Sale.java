/**
 * Author:   shitian
 * Date:     2018/7/5 15:36
 * Description:
 */
package com.rocky.design.mediator;

import java.util.Random;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public class Sale {
    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);
    }

    //反馈销售情况，0～100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSellStatus() {
        Random random = new Random();
        int result = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + result);
        return result;
    }

    public void offSell() {
        //库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

}
