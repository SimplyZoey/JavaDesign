/**
 * Author:   shitian
 * Date:     2018/7/10 13:46
 * Description:
 */
package com.rocky.design.state;

import com.rocky.design.state.impl.ClosingState;
import com.rocky.design.state.impl.RunningState;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/10
 * @since 1.0.0
 */
public class StateClient {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
