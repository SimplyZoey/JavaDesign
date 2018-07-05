/**
 * Author:   shitian
 * Date:     2018/7/5 15:51
 * Description:
 */
package com.rocky.design.mediator;

/**
 * 〈中介模式〉
 *
 * 不使用模式
 * 1.各个类之间互相依赖
 * 2.耦合太大，不便于扩展
 * 3.修改涉及面太广
 *
 * 使用中介模式：所有对象都统一跟中介打交道，解耦
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public class SaleClient {

    public static void main(String[] args) {
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
