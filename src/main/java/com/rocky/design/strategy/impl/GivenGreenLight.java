/**
 * Author:   shitian
 * Date:     2018/7/9 14:02
 * Description:
 */
package com.rocky.design.strategy.impl;

import com.rocky.design.strategy.IStrategy;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
