/**
 * Author:   shitian
 * Date:     2018/7/5 14:25
 * Description:
 */
package com.rocky.design.prototype;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/5
 * @since 1.0.0
 */
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件主题
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String context;
    //邮件尾
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvConext();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
