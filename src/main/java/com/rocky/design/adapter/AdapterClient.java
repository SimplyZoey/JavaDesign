/**
 * Author:   shitian
 * Date:     2018/7/9 14:19
 * Description:
 */
package com.rocky.design.adapter;

import com.rocky.design.adapter.impl.UserInfo;

/**
 * 〈适配器模式〉
 * 优点：
 * 1.将两个没有联系的类，关联到一起
 * 2.增加类的透明：高层不需要知道底层做了什么转换
 * 3.提高类的服用度
 * 4.灵活性好
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class AdapterClient {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
//        IUserInfo youngGirl = new UserInfo();
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查到101个
        for(int i=0;i<10;i++){
            youngGirl.getMobileNumber();
        }
    }
}
