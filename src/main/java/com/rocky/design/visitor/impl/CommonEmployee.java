/**
 * Author:   shitian
 * Date:     2018/7/10 9:10
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
public class CommonEmployee extends Employee {
    //工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
