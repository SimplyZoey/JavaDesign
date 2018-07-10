/**
 * Author:   shitian
 * Date:     2018/7/10 9:11
 * Description:
 */
package com.rocky.design.visitor.impl;

import com.rocky.design.visitor.Employee;
import com.rocky.design.visitor.IVisitor;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class Manager extends Employee {
    //这类人物的职责非常明确：业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
