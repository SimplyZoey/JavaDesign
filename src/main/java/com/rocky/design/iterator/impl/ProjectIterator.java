/**
 * Author:   shitian
 * Date:     2018/7/9 14:34
 * Description:
 */
package com.rocky.design.iterator.impl;

import com.rocky.design.iterator.IProject;
import com.rocky.design.iterator.IProjectIterator;

import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class ProjectIterator implements IProjectIterator {
    //所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList;
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    //判断是否还有元素，必须实现
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    //取得下一个值
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    //删除一个对象
    public void remove() {
        //暂时没有使用到
    }
}
