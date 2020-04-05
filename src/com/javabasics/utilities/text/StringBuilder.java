package com.javabasics.utilities.text;

public class StringBuilder {

    public void ShowInfo() {

        String name, address;
        float numberPhone;
        name = "Miguel";
        address = "Calle 5 # 9-106";
        numberPhone = 3114837604F;

        java.lang.StringBuilder info = new java.lang.StringBuilder();
        info.append("Nombre: ")
                .append(name).append("\n")
                .append("Numero: ").append(numberPhone).append("\n")
                .append("Dirección: ").append(address);

        System.out.println(info);
    }
}
