/**
 * Author:   shitian
 * Date:     2018/7/10 10:46
 * Description:
 */
package com.rocky.design.visitor;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public interface ITotalVisitor extends IVisitor {
    //获取所有员工薪水
    void getTotalSalary();
}

