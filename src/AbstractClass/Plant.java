package AbstractClass;
//El agregado "extends" significa que hereda de una clase abstracta o tambien conocida como superclase, en este caso de livingBeing
public class Plant extends livingBeing {
    //El agregado Override quiere decir que se esta sobreescribiendo o redefiniendo el metodo abstracto que por defecto viene vacio desde "livingBeing"
    @Override
    public void feed() {
        System.out.println("Las plantas utilizan la fotosintesis para llevar a cabo su nutrición");
    }
}
