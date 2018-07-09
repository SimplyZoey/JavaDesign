/**
 * Author:   shitian
 * Date:     2018/7/9 17:49
 * Description:
 */
package com.rocky.design.memento;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class CareTaker {
    //备忘录对象
    private Boy memento;
    public Boy getMemento() {
        return memento;
    }
    public void setMemento(Boy memento) {
        this.memento = memento;
    }
}
