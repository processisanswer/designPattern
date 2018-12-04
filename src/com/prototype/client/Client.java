package com.prototype.client;

import com.prototype.advertise.AdvertiseTemplate;
import com.prototype.mail.Mail;

/**
 * Created by NJTZ on 2018/12/4.
 */
public class Client {
    private static int MAX_COUNT=10;

    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        //把模板定义处理,从db获取
        Mail mail=new Mail(new AdvertiseTemplate());
        while(i<MAX_COUNT){
            mail.setAppellation("第"+i+"先生或女士");
            mail.setReceiver("mailAccount"+i+"@mail.com");
            sendEmail(mail);
            i++;
        }
    }

    private static void sendEmail(Mail mail) {
        System.out.println(
                "标题："+mail.getSubject()+"\n收件人："+mail.getReceiver()
                        +"\n发送成功..."
        );
    }
}
