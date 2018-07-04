/**
 * Author:   shitian
 * Date:     2018/7/4 14:09
 * Description:
 */
package com.rocky.design.factory.nvwa;

import com.rocky.design.factory.nvwa.impl.MaleYellowHuman;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class MaleFactory implements HumanFactory {

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
        return new MaleYellowHuman();
    }
}
