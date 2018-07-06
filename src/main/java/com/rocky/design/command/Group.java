/**
 * Author:   shitian
 * Date:     2018/7/6 10:44
 * Description:
 */
package com.rocky.design.command;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public abstract class Group {

    //找到对应的组
    public abstract void find();

    //增加需求
    public abstract void add();

    //删除需求
    public abstract void delete();

    //修改需求
    public abstract void change();

    //提供变更计划
    public abstract void plan();
}
