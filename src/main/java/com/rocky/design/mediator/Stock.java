/**
 * Author:   shitian
 * Date:     2018/7/5 15:36
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
public class Stock {

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        //降价销售
        sale.offSell();
        //拒绝采购
        purchase.refuseBuyIBMComputer();
    }
}
