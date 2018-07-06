/**
 * Author:   shitian
 * Date:     2018/7/5 15:51
 * Description:
 */
package com.rocky.design.mediator;

/**
 * 〈中介模式：中介者模式适用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构〉
 *
 * 不使用模式
 * 1.各个类之间互相依赖
 * 2.耦合太大，不便于扩展
 * 3.修改涉及面太广
 *
 * 使用中介模式：所有对象都统一跟中介打交道，解耦
 * 1.将一对多的依赖，变更为一对一的依赖，解耦
 * 2.缺点：中介者融合了所有业务逻辑，会膨胀的很大
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public class SaleClient {

    public static void main(String[] args) {
        //由于是子类构造函数触发父类构造函数，所以父类中的this指的是子类对象
        AbstractMediator mediator = new Mediator();

        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
