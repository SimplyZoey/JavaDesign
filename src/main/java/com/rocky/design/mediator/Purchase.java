/**
 * Author:   shitian
 * Date:     2018/7/5 15:35
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
public class Purchase {

    public void buyIBMComputer(int number){
        Sale sale = new Sale();
        Stock stock = new Stock();
        int saleStatus = sale.getSellStatus();
        if(saleStatus > 80){
            System.out.println("销售状况良好，采购IBM电脑"+number+"台");
        }else{
            number = number/2;
            System.out.println("销售状况不佳，采购IBM电脑"+number+"台");
        }
        stock.increase(number);
    }

    public void refuseBuyIBMComputer(){
        System.out.println("不再采购IBM电脑");
    }
}
