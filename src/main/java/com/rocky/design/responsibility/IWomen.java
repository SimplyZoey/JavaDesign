/**
 * Author:   shitian
 * Date:     2018/7/6 11:40
 * Description:
 */
package com.rocky.design.responsibility;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public interface IWomen {
    //获得个人状况
    int getType();
    //获得个人请示，你要干什么？出去逛街？约会?还是看电影？
    String getRequest();
}

