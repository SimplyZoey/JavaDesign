/**
 * Author:   shitian
 * Date:     2018/7/6 10:58
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
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
