package com;

import com.data.IteratorClass;
import com.tasks.SecondProcess;
import com.utilities.text.StringBuilder;
import com.utilities.text.TextColor;

public class App {
    public static void main(String[] args) {

        String[] values = {"Mandarina", "Hierba", "Saltamontes", "Sábanas", "Cielo", "Tomate"};

        TextColor text = new TextColor();
        StringBuilder info = new StringBuilder();
        IteratorClass objI = new IteratorClass();
        Thread translate = new Thread(new SecondProcess());

        text.ShowTextWithColor(values);
        info.ShowInfo();
        objI.Iteration();
        translate.start();
    }
}