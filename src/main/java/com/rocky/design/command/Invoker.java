/**
 * Author:   shitian
 * Date:     2018/7/6 11:01
 * Description:
 */
package com.rocky.design.command;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void Action(){
        this.command.execute();
    }

}
