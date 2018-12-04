package com.prototype.mail;

import com.prototype.advertise.AdvertiseTemplate;

/**
 * Created by NJTZ on 2018/12/4.
 * 实现Cloneable接口，重写clone()方法
 * 原型模式，使用对象的拷贝功能来解决多线程发送邮件带来的混乱问题
 */
public class Mail  implements Cloneable {
    private  String receiver;
    private String subject;
    private String appellation;
    private String context;
    private final String tail="人民银行版权所有";

    public Mail(AdvertiseTemplate advertiseTemplate){
        this.context=advertiseTemplate.getAdvContent();
        this.subject=advertiseTemplate.getAdvSubject();
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

/*    public void setTail(String tail) {
        this.tail = tail;
    }*/
    //重写clone方法
    @Override
    public Mail clone(){
        Mail mail=null;

        try {
            mail=(Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }
}
