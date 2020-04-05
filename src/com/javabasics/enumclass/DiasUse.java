package com.javabasics.enumclass;

public class DiasUse {
    private Dias dia;

    public DiasUse(Dias dia){
        this.dia = dia;
    }
    public void IndicarDia(){
        switch (dia){
            case LUNES:
                System.out.println("El dias es: " + dia);
                break;
            case MARTES:
                System.out.println("El dia es: " + dia);
                break;
            case MIERCOLES:
                System.out.println("El dia es: " + dia);
                break;
            case JUEVES:
                System.out.println("El dia es: " + dia);
                break;
            case VIERNES:
                System.out.println("El dia es: " + dia);
                break;
            case SABADO:
                System.out.println("El dia es: " + dia);
                break;
            case DOMINGO:
                System.out.println("El dia es: " + dia);
                break;
            default:
                System.out.println("¡Oh vaya!, parece que no tienes un dia que mostrar");
                break;
        }
    }
    public void HorasDeTrabajoAlDia(){
        System.out.println("Las horas de trabajo por el dia que usted selecciono son: " + dia.getHours());
    }
}
