/**
 * Author:   shitian
 * Date:     2018/7/10 11:09
 * Description:
 */
package com.rocky.design.visitor.assign;

import com.rocky.design.visitor.assign.impl.KungFuRole;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public abstract class AbsActor {
    //演员都能够演一个角色
    public void act(Role role){
        System.out.println("演员可以扮演任何角色");
    }
    //可以演功夫戏
    public void act(KungFuRole role){
        System.out.println("演员都可以演功夫角色");
    }
}
