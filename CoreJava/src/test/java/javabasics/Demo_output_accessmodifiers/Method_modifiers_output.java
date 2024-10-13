package javabasics.Demo_output_accessmodifiers;


import javabasics.methods_modifiers.Private_method;
import javabasics.methods_modifiers.Protected_method;
import javabasics.methods_modifiers.Public_method;

public class Method_modifiers_output {

    public static void main(String[] args) {

           // For Default method modifiers cant used in different package, but we can create an object for it.
//        Default_methods a = new Default_methods();
//        a.add();

        // For Public method modifiers we can use in different package and also in same package.
        Public_method b = new Public_method();
        b.publicM();

              // We cant use the private methods modifiers in the same package as well as different package, but we can use in the same class itself.
//        Private_method c = new Private_method();
//        c.privatem();

// For Protected method modifiers cant used in different package, but we can create an object for it.
//        Protected_method d =new Protected_method();
//        d.protectedm();






    }
}
