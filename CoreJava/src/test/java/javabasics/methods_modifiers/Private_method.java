package javabasics.methods_modifiers;

public class Private_method {
    private void privatem(){
        System.out.println("Private method called...");
    }
//Only in the same class we can use this private_method.

    public static void main(String[] args) {
        Private_method a = new Private_method();
        a.privatem();
    }
}
