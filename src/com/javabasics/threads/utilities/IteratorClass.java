package com.javabasics.threads.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorClass{

    public void Iteration(){

        List<String> Languaje = new ArrayList<>();

        Languaje.add("Java");
        Languaje.add("Php");
        Languaje.add(".NET");
        Languaje.add("JavaScript");
        Languaje.add("C++");

        Iterator<String> it = Languaje.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
