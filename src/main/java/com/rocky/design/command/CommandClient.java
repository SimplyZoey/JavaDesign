/**
 * Author:   shitian
 * Date:     2018/7/6 10:49
 * Description:
 */
package com.rocky.design.command;

import com.rocky.design.command.group.RequirementGroup;
import com.rocky.design.command.impl.AddRequirementCommand;

/**
 * 〈命令模式〉
 * 1.解耦，用户与命令的接收者通过invoker隔离
 * 2.扩展性强，增加新功能，只需要增加一个新的命令
 *
 * 缺点：
 * 1.会造成command子类的膨胀
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public class CommandClient {

    public static void main(String[] args) {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-----------客户要求增加一项需求---------------");
        Invoker invoker = new Invoker();
        AddRequirementCommand command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.Action();
    }
}
