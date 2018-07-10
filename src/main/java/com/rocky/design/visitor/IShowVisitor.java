/**
 * Author:   shitian
 * Date:     2018/7/10 10:44
 * Description:
 */
package com.rocky.design.visitor;

/**
 * 〈〉
 * 扩展接口，而不是修改接口
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public interface IShowVisitor extends IVisitor {
    //展示报表
    void report();
}

