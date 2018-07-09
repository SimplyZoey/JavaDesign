/**
 * Author:   shitian
 * Date:     2018/7/9 16:23
 * Description:
 */
package com.rocky.design.facade;

/**
 * 〈门面模式〉
 * 优点：
 * 1.提高灵活性，子系统的封装，可以在门面类中修改或者扩展
 * 2.提高安全，门面类中可以控制访问权限，哪些能访问，哪些不能
 * 3.减少系统之间的耦合，外围系统不直接与子系统打交道
 *
 * 缺点：
 * 1.有变更后，需要不断修改门面对象，扩展或者重写
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class FacadeClient {

    public static void main(String[] args) {
        //创建一个处理信件的过程
        ModenPostOffice postOffice = new ModenPostOffice();
        String context = "Hello,It's me,do you know who I am? I'm ....";
        String address = "Happy Road No. 666,God Province,Heaven";
        postOffice.sendLetter(context, address);
    }
}
