/**
 * Author:   shitian
 * Date:     2018/6/13 15:17
 * Description: sms sender
 */
package com.rocky.design.factory.simplefactory.impl;

import com.rocky.design.factory.simplefactory.Sender;

/**
 * 〈sms sender〉
 *
 * @author shitian
 * @create 2018/6/13
 * @since 1.0.0
 */
public class SmsSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("sms sender : " + message);
    }
}
