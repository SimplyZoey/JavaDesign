/**
 * Author:   shitian
 * Date:     2018/7/6 11:42
 * Description:
 */
package com.rocky.design.responsibility.impl;

import com.rocky.design.responsibility.Handler;
import com.rocky.design.responsibility.IWomen;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public class Father extends Handler {

    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
