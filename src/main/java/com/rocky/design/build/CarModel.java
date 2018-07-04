/**
 * Author:   shitian
 * Date:     2018/7/4 14:56
 * Description:
 */
package com.rocky.design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    //定义final，防止模板方法被重写
    final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }
        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
