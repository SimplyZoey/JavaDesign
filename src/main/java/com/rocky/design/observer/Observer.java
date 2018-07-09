/**
 * Author:   shitian
 * Date:     2018/7/9 15:45
 * Description:
 */
package com.rocky.design.observer;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public interface Observer {
    //一发现别人有动静，自己也要行动起来
    void update(String context);
}

