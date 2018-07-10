/**
 * Author:   shitian
 * Date:     2018/7/10 11:08
 * Description:
 */
package com.rocky.design.visitor.assign;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public interface Role {
    //演员要扮演的角色
    void accept(AbsActor actor);
}

