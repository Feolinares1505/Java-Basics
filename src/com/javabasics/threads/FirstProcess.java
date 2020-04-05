package com.javabasics.threads;

public class FirstProcess extends Thread{

    String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void run(){
        System.out.print(value);
    }
}
