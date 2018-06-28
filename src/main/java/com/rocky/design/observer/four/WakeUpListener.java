/**
 * Author:   shitian
 * Date:     2018/6/28 10:37
 * Description:
 */
package com.rocky.design.observer.four;

import com.rocky.design.observer.three.WakeUpEvent;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/6/28
 * @since 1.0.0
 */
public interface WakeUpListener {

    /**
     * 定义醒来后的时间处理
     * @param wakeUpEvent
     */
    void action2WakenUp(WakeUpEvent wakeUpEvent);
}

