package com.practice;

import com.practice.color.Color;
import com.practice.info.MyInfo;
import com.practice.words.Translate;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        String[] values = {"Mandarina", "Hierba", "Saltamontes", "Sábanas", "Cielo", "Tomate"};

        Color text = new Color();
        MyInfo info = new MyInfo();
        Translate translate = new Translate();

        text.ShowTextWithColor(values);
        info.ShowInfo();
        translate.ShowTranslateValue();
    }
}
