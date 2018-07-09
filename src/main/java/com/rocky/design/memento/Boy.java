/**
 * Author:   shitian
 * Date:     2018/7/9 17:35
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
public class Boy implements Cloneable{
    private String state;

    public void changeState(){
        this.state = "心情可能很不好";
    }

    /**
     * 创建一个备份
     * @return
     */
//    public Memento createMementor(){
//        return new Memento(this.state);
//    }

    /**
     * 恢复一个备份
     * @param
     */
//    public void restoreMemento(Memento memento){
//        this.state = memento.getState();
//    }

    public Boy createMementor(){
        Boy result = null;
        try {
            result = (Boy)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void restoreMemento(Boy boy){
        this.state = boy.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
