/**
 * Author:   shitian
 * Date:     2018/7/10 11:10
 * Description:
 */
package com.rocky.design.visitor.assign.impl;

import com.rocky.design.visitor.assign.AbsActor;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class OldActor extends AbsActor {
    //不演功夫角色
    public void act(KungFuRole role){
        System.out.println("年龄大了，不能演功夫角色");
    }
}
