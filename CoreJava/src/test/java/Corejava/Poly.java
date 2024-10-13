package Corejava;

public class Poly {

    //Over Loading with different parameter

    public void login(){
        System.out.println("Login Done...");
    }

    public void login(String DamDam){
        System.out.println(DamDam + "Login Done...");
    }

    public static void main(String[] args) {
        Poly a = new Poly();
        a.login();
        a.login("DomDOm");
    }


}
