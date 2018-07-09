/**
 * Author:   shitian
 * Date:     2018/7/9 9:06
 * Description:
 */
package com.rocky.design.decorate.impl;

import com.rocky.design.decorate.Decorator;
import com.rocky.design.decorate.SchoolReport;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class SortDecorator extends Decorator {
    //构造函数
    public SortDecorator(SchoolReport sr){
        super(sr);
    }
    //告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }
    //老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
