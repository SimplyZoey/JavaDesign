/**
 * Author:   shitian
 * Date:     2018/7/9 15:05
 * Description:
 */
package com.rocky.design.composite.impl;

import com.rocky.design.composite.Corp;

import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class Branch extends Corp {
    //存储子节点的信息
    private ArrayList<Corp> subordinateList = new ArrayList<>();

    //通过构造函数传递树枝节点的参数
    public Branch(String name,String position,int salary){
        super(name,position,salary);
    }
    //增加一个子树枝节点
    public void addSubordinate(Corp corp) {
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    //获得下级的信息
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
