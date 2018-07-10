/**
 * Author:   shitian
 * Date:     2018/7/10 10:52
 * Description:
 */
package com.rocky.design.visitor;

import com.rocky.design.visitor.impl.CommonEmployee;
import com.rocky.design.visitor.impl.Manager;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}

