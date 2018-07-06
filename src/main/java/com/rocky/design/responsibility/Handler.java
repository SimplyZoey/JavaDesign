/**
 * Author:   shitian
 * Date:     2018/7/6 15:11
 * Description:
 */
package com.rocky.design.responsibility;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/6
 * @since 1.0.0
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    /**
     * 如果自己无法处理，可以设置能处理的handler
     *
     * @param handler
     */
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 回应方法
     *
     * @param women
     */
    protected abstract void response(IWomen women);

    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("---没地方请示了，按不同意处理---");
            }
        }
    }
}
