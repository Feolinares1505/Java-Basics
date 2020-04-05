import javax.swing.JOptionPane;

public class Correccion {

    private double saldo = 100000, valor, ganancias;
    private final double INTE = 0.02;
    private final String MENU = " Opcion: \n" + " 1 Consignar \n"
            + " 2 Retirar \n"
            + " 3 Saldo \n"
            + " 4 Finalizar \n";

    public static void main(String[] args) {
        Correccion obj = new Correccion();
        obj.iniciar();
    }

    public void iniciar() {
        clave();
        int opc = 0;
        while (true) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(MENU));
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

    public void consignar() {
        valor = Double.parseDouble(JOptionPane.showInputDialog("Entrar valor consignar"));

        if (valor < 50){
            JOptionPane.showMessageDialog(null, "El valor a consignar debe ser superior a $50");
        }else {
            saldo = saldo + valor;
        }
    }

    public void retirar() {
        valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Entrar valor retirar"));

        if (saldo > valor){
            saldo = saldo - valor;
            extraerintereses(valor);
        }else {
            JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para realizar el retiro.");
        }
    }

    public void extraerintereses(double x){
        double temp;
        temp = (valor/100)* INTE;
        ganancias = ganancias + temp;
        JOptionPane.showMessageDialog(null, "Hemos descontado " + temp + " pesos, por el retiro realizado");
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Su saldo = " + saldo);

    }

    public void finalizar() {
        JOptionPane.showMessageDialog(null, "Vuelva pronto");
        System.exit(0);
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