/**
 * Author:   shitian
 * Date:     2018/7/6 11:00
 * Description:
 */
package com.rocky.design.command.impl;

import com.rocky.design.command.Command;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
