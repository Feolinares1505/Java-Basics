package com.tasks;

public class FirstProcess extends Thread{

    String value;

    public void setNumRepetition(String value) {
        this.value = value;
    }

    @Override
    public void run(){
        System.out.print(value);
    }
}
