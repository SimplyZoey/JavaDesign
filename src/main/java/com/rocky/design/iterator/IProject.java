/**
 * Author:   shitian
 * Date:     2018/7/9 14:28
 * Description:
 */
package com.rocky.design.iterator;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public interface IProject {
    //增加项目
    public void add(String name,int num,int cost);
    //从老板这里看到的就是项目信息
    public String getProjectInfo();
    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}

