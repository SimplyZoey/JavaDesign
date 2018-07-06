/**
 * Author:   shitian
 * Date:     2018/7/6 10:57
 * Description:
 */
package com.rocky.design.command;

import com.rocky.design.command.group.CodeGroup;
import com.rocky.design.command.group.PageGroup;
import com.rocky.design.command.group.RequirementGroup;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    //执行命令
    public abstract void execute();
}
