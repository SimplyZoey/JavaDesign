/**
 * Author:   shitian
 * Date:     2018/7/9 14:17
 * Description:
 */
package com.rocky.design.adapter;

import java.util.Map;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public interface IOuterUser {
    //基本信息，比如名称、性别、手机号码等
    Map getUserBaseInfo();
    //工作区域信息
    Map getUserOfficeInfo();
    //用户的家庭信息
    Map getUserHomeInfo();
}

