package com.javabasics.threads;

import com.javabasics.threads.utilities.ArrayListUse;
import com.javabasics.threads.utilities.StructureOfData;

import java.util.ArrayList;

public class SecondProcess implements Runnable{

    @Override
    public void run() {
        ArrayList<StructureOfData> use = ArrayListUse.ShowTranslateValue();

        for (StructureOfData d: use) {
            System.out.println(d.spanish + " : " + d.english);
        }
    }
}
