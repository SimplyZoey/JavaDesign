/**
 * Author:   shitian
 * Date:     2018/7/6 9:29
 * Description:
 */
package com.rocky.design.mediator;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }

}
