/**
 * Author:   shitian
 * Date:     2018/7/10 9:12
 * Description:
 */
package com.rocky.design.visitor;

import com.rocky.design.visitor.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈访问者模式〉
 * 缺点：
 * 1.需要公布具体元素的细节，即访问者类中拼接报表信息
 * 2.具体的元素变化比较困难，比如类中增加一个属性，如果有多个visitor类，都需要修改
 * 3.违背了依赖倒置，要扩展相对困难
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class VisitorClient {

    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        IShowVisitor showVisitor = new ShowVisitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(visitor);
            emp.accept(totalVisitor);
            emp.accept(showVisitor);
        }
        totalVisitor.getTotalSalary();
        showVisitor.report();
    }

    //模拟出公司的人员情况，我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
