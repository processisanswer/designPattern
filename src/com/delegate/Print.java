package com.delegate;

/**
 * Created by NJTZ on 2018/12/18.
 */
public class Print {
    RealPrinter printer=new RealPrinter();
    public void out(){
        printer.print();
    }
}
