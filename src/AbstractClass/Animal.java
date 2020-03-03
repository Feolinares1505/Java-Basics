package AbstractClass;
//Animal pasa a ser una clase abstracta tambien pues no es posible definir el metodo de alimentación pues esta muy generalizado,
// de este se desprenderan nuevas clases las cuales si podran sobreescribir y definir los metodos abstractos pertenecientes a la clase padre
public abstract class Animal extends livingBeing{
    //no es necesario redefinir el metodo que desciende desde "livingBeing", pues estos será definidos en el siguiente subnivel, esta clase se usario como forma de categorización
}
