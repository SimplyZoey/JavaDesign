/**
 * Author:   shitian
 * Date:     2018/7/4 14:12
 * Description:
 */
package com.rocky.design.factory.nvwa;

import com.rocky.design.factory.nvwa.impl.FemaleYellowHuman;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return null;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
