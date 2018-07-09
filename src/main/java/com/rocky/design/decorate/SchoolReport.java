/**
 * Author:   shitian
 * Date:     2018/7/9 8:57
 * Description:
 */
package com.rocky.design.decorate;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
