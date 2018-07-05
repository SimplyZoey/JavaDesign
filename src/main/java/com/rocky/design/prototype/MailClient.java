/**
 * Author:   shitian
 * Date:     2018/7/5 14:29
 * Description:
 */
package com.rocky.design.prototype;

/**
 * 〈原型模式优点〉
 * 1.在内存中直接拷贝，效率高于new，特别是在需要创建大量对象的循环体中
 * 2.直接拷贝，不会调用对象的构造函数
 * 3.默认为浅拷贝，对象中的私有变量是共享的（除基本数据类型+String）
 *
 * 适用场景
 * 1.初始化一个业务对象非常耗时
 * 2.性能和安全
 * 3.一个对象对应多个修改者场景
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public class MailClient {

    public static void main(String[] args) throws Exception{
        int MAX_COUNT = 5;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("招商银行版权所有");
        for (int i = 0; i < MAX_COUNT; i++) {
            //这种不通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式，多线程下也不影响
            Mail cloneMail = (Mail)mail.clone();
            cloneMail.setAppellation("shitian" + i);
            cloneMail.setReceiver("shitian" + i + "@163.com");
            sendMain(cloneMail);
        }
    }

    private static void sendMain(Mail mail) {
        System.out.println("标题：" + mail.getSubject());
        System.out.println("收件人：" + mail.getReceiver());
        System.out.println(mail.getAppellation() + "：" + mail.getContext());
        System.out.println(mail.getTail());
    }
}
