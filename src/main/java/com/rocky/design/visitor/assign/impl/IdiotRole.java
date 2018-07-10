/**
 * Author:   shitian
 * Date:     2018/7/10 11:08
 * Description:
 */
package com.rocky.design.visitor.assign.impl;

import com.rocky.design.visitor.assign.AbsActor;
import com.rocky.design.visitor.assign.Role;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class IdiotRole implements Role {

    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
