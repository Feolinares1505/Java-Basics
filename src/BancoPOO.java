import javax.swing.JOptionPane;

public class BancoPOO {

    //Los atributos de la clase no son privados, por ende no se esta haciendo uso del encapsulamiento
    //inte es una variable de la cual no se esta haciendo uso en ningún momento, ¿cual es su proposito?
    //Por logica se podria decir que guarda el porcentaje de intereses que exige el banco, deberia utilizarse en el metodo "retirar" para extraer las ganancias, y si es un valor fijo, definirse como constante
    double saldo = 100000, valor, inte = 0.02;

    //Al ser un atributo de clase, no es necesario inicializarlo, esta bien con dejarlo como "String menu;", si no se conoce su valor
    String menu = "";

    public static void main(String[] args) {
        BancoPOO objBan = new BancoPOO();
    }

    public BancoPOO() {
        //Un error de estandares es usar el metodo constructor para hacer el llamado de otros metodos e implementar condiciones, este se usa unicamente para inicializar los atributos de la clase y en algunos casos quiza hacer uso de condiciones, pero unicamente para la definicion de dichos archibutos.
        clave();
        elmenu();
        int opc = 0;
        //Por lo general no se haria uso de un ciclo indeterminado o infinito como lo es este, pero al tener un metodo capaz de finalizarlo, no hay problema
        while (true) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    consignar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    finalizar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Errada");
                    break;
            }
        }
    }
    //Supongo que una consignación tiene un valor minimo y no puede ser negativo, falta condicionarlo
    public void consignar() {
        valor = Double.parseDouble(JOptionPane.showInputDialog("Entrar valor consignar"));
        saldo = saldo + valor;
    }

    //Que pasaria si el valor a retirar excede el salgo disponible? Falta condicionarlo
    public void retirar() {
        //Si se desea extraer el porcentaje de interes que ganará el banco, entonces ¿en donde se va a guardar?
        valor = Double.parseDouble(JOptionPane.showInputDialog("Entrar valor retirar"));
        saldo = saldo - valor;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Su saldo = " + saldo);
    }

    public void finalizar() {
        JOptionPane.showMessageDialog(null, "Vuelva pronto");
        System.exit(0);
    }

    //Este metodo es innecesario
    public void elmenu() {
        menu = " 1 Consignar \n"
                + " 2 Retirar \n"
                + " 3 Saldo \n"
                + " 4 Finalizar \n"
                + " Opcion";
    }

    public void clave() {
        int claSis = 2468;
        int claDig, veces = 0;
        while (true) {
            claDig = Integer.parseInt(JOptionPane.showInputDialog("Digite su clave"));
            if (claSis == claDig) {
                JOptionPane.showMessageDialog(null, "Ingreso Seguro");
                break;
            } else {
                veces++;
                JOptionPane.showMessageDialog(null, "Clave errada, lleva " + veces);
                if (veces == 3) {
                    JOptionPane.showMessageDialog(null, "Cuenta Bloqueada, ir Banco");
                    System.exit(0);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "SISTEMA BANCARIO A SU ALCANCE");
    }
}