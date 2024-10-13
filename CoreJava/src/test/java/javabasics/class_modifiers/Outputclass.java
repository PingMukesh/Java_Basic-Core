package javabasics.class_modifiers;

public class Outputclass extends Public_abstract_class {
    public static void main(String[] args) {
        Public_Class a =new Public_Class();
        a.P_class();

        Default_class b = new Default_class();
        b.D_class();

//Object can't be created within the same and different package due to abstract method.
// To access, we need to extend methode in different class

        Outputclass c =new Outputclass();
        c.number();

        Final_class d =new Final_class();
        d.numbers();




    }
}
