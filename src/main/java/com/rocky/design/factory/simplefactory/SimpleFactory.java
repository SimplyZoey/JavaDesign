/**
 * Author:   shitian
 * Date:     2018/6/13 15:18
 * Description: factory test
 */
package com.rocky.design.factory.simplefactory;

import com.rocky.design.factory.simplefactory.Sender;
import com.rocky.design.factory.simplefactory.impl.MailSender;
import com.rocky.design.factory.simplefactory.impl.SmsSender;

/**
 * 〈factory test〉
 *
 * @author shitian
 * @create 2018/6/13
 * @since 1.0.0
 */
public class SimpleFactory {

    /**
     * 通过type可能容易导致误写，可以考虑对应每个sender都创建一个工厂方法
     * @param type
     * @return
     */
    public static Sender produce(String type){
        Sender sender = null;
        if("mail".equals(type)){
            sender = new MailSender();
        }else if("sms".equals(type)){
            sender = new SmsSender();
        }
        return sender;
    }

    public static Sender produceMailSender(){
        return new MailSender();
    }

    public static Sender produceSmsSender(){
        return new SmsSender();
    }

    public static void main(String[] args){
//        Sender smsSender = produce("sms");
        Sender smsSender = produceSmsSender();
        smsSender.send("hello.....");
    }
}
