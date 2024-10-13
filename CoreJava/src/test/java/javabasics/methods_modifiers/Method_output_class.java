package javabasics.methods_modifiers;

public class Method_output_class {
    public static void main(String[] args) {
        Default_methods a = new Default_methods();
        a.add();

        Public_method b = new Public_method();
        b.publicM();

             // We cant use the private methods modifiers in the same package as well as different package, but we can use in the same class itself.
//        Private_method c = new Private_method();
//        c.privatem();

        Protected_method d =new Protected_method();
        d.protectedm();






    }



}
