/**
 * Author:   shitian
 * Date:     2018/7/9 15:06
 * Description:
 */
package com.rocky.design.composite.impl;

import com.rocky.design.composite.Corp;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class Leaf extends Corp {
    //通过构造函数传递信息
    public Leaf(String name,String position,int salary){
        super(name,position,salary);
    }
}
