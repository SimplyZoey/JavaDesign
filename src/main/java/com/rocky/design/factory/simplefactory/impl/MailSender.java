/**
 * Author:   shitian
 * Date:     2018/6/13 15:16
 * Description: mailsender
 */
package com.rocky.design.factory.simplefactory.impl;

import com.rocky.design.factory.simplefactory.Sender;

/**
 * 〈mailsender〉
 *
 * @author shitian
 * @create 2018/6/13
 * @since 1.0.0
 */
public class MailSender implements Sender{

    @Override
    public void send(String message) {
        System.out.println("mail sender : " + message);
    }
}
