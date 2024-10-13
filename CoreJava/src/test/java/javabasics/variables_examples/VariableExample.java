package javabasics.variables_examples;
/*
There are 2 types of it.
    1. Global Variable
    2. Local Variable
 */
public class VariableExample {

    int b = 5; //  Global variable: only this variable can use class level, and it should assign in class level.

    public static void main(String[] args) {
        VariableExample VE = new VariableExample();


    }

    public void m1(){
        int a =1; // Local variable: only this variable can use only in m1 method.
        System.out.println(a);
    }

    public void m2(){
        System.out.println(b);
    }
}
