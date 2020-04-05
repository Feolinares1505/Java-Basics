package com.javabasics.threads;

public class ThreadsUse {
    public static void main(String[] args) {
        /*ES MEGA IMPORTANTE ACLARAR QUE CUANDO SE HACE USO DE LOS HILOS
         * SE DEBEN DE INSTANCIAR PRIMERO TODOS Y LUEGO SER INICIADOS CON EL
         * METODO START() DE LO CONTRARIO LOS HILOS NO SE EJECUTARIAN EN PARALELO SINO EN ORDEN DE CREACIÓN
         * */
        //Esta es la implementacion de un objeto cuando se usa la
        //palabra reservada extends directamente desde la clase Thread
        FirstProcess[] threads = new FirstProcess[6];

        String[] value = {"M", "I", "G", "U", "E", "L\n"};

        for (int i = 0; i < 6; i++){
            threads[i] = new FirstProcess();
            threads[i].setValue(value[i]);
        }

        for (int i = 0; i < 6; i++){
            threads[i].start();
            try{
                threads[i].sleep(500);
            }catch (InterruptedException e){
                System.out.println("Hay un error en el hilo");
            }
            threads[i].stop();
        }

        //Esta es la implementación cuando se hace uso de la interface Runnable
        Thread SecondThread = new Thread(new SecondProcess());
        SecondThread.start();

    }
}
