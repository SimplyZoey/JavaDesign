/**
 * Author:   shitian
 * Date:     2018/7/10 11:11
 * Description:
 */
package com.rocky.design.visitor.assign;

import com.rocky.design.visitor.assign.impl.KungFuRole;
import com.rocky.design.visitor.assign.impl.OldActor;
import com.rocky.design.visitor.assign.impl.YoungActor;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class AssignClient {

    public static void main(String[] args) {
        //定义一个演员
        AbsActor actor = new OldActor();
        //定义一个角色
        Role role = new KungFuRole();
        //开始演戏
        role.accept(actor);
        role.accept(new YoungActor());
    }
}
