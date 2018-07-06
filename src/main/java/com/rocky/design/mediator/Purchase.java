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
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator){
        super(mediator);
    }

    public void buyIBMComputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBMComputer(){
        System.out.println("不再采购IBM电脑");
    }
}
