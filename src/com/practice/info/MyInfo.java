package com.practice.info;

public class MyInfo{

    public void ShowInfo() {

        String name, address;
        float numberPhone;
        name = "Miguel";
        address = "Calle 5 # 9-106";
        numberPhone = 3114837604F;

        StringBuilder info = new StringBuilder();
        info.append("Nombre: ")
                .append(name).append("\n")
                .append("Numero: ").append(numberPhone).append("\n")
                .append("Dirección: ").append(address);

        System.out.println(info);
    }
}
