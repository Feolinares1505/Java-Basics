package com.javabasics.utilities.text;

public class TextColor {

    public void ShowTextWithColor(String[] values){

        String[] colors = new String[6];

        colors[0] = "\033[31m";
        colors[1] = "\033[32m";
        colors[2] = "\033[33m";
        colors[3] = "\033[34m";
        colors[4] = "\033[35m";
        colors[5] = "\033[37m";


        int i = 0;
        for (String e : values) {
            System.out.println(colors[i] + e);
            i++;
        }
    }

}
