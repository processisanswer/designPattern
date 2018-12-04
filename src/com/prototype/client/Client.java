package com.prototype.client;

import com.prototype.advertise.AdvertiseTemplate;
import com.prototype.mail.Mail;

/**
 * Created by NJTZ on 2018/12/4.
 * mail.clone()这个方法，把对象拷贝一份，产生一个新的对象，和原有对象一样，然后再修改细节的数据，
 * 如称谓、收件人地址等
 * 不通过new关键字来产生一个对象，而是通过对象拷贝来实现的模式就叫作原型模式
 * 注意点：
 * 1 对象拷贝是，类的构造函数是不会被执行的，也就是没有构造函数的约束。
 *   clone方法的原理是从内存中（具体的说是堆内存）以二进制流的方式进行拷贝，重新分配一个内存块。
 * 2 浅拷贝和深拷贝问题。Object类提供的方法，clone只是拷贝本对象，其对象内部的数组、引用对象等均不拷贝，还是
 *   指向原生对象的内部元素地址。——浅拷贝，但是String类型会被当做基本类型拷贝。
 *   深度拷贝的实现方法
 * 3 final关键修饰引用对象，是无法进行clone的。
 *进阶：
 *   深度拷贝实现方式
 *   final关键字修饰的对象，内存特性
 */
public class Client {
    private static int MAX_COUNT=10;

    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        //把模板定义处理,从db获取
        Mail mail=new Mail(new AdvertiseTemplate());
        //mail.setTail("人民银行版权所有...");
        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            Mail mailClone=mail.clone();
            mailClone.setAppellation("第"+i+"先生或女士");
            mailClone.setReceiver("mailAccount"+i+"@mail.com");
            sendEmail(mailClone);
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
