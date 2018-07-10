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
public class YoungActor extends AbsActor {
    //年轻演员最喜欢演功夫戏
    public void act(KungFuRole role){
        System.out.println("最喜欢演功夫角色");
    }
}
