package javabasics;

public class Loops {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 60}; // Single-Dimensional Array

// For -Loop

        for (int i = 0; i < a.length; i++) {   //Syntax: for( initialization; condition(True/False); Increment(++)/Decrement(--) ){}
            System.out.println("For - Loop :" + a[i]);
        }



//While - Loop

        while (a[2] == 30) {         //Syntax: While(condition(True/False)){}
            System.out.println("While - Loop : " + a[2]);
            break;
        }

 //Do-While - Loop

        // Syntax: Do{}
        //   while();

        int replacement = 5;
        int i = 0;


        do {
            a[0] = replacement;
            i++;
        }
        while (i<1);

        System.out.println("\n\nArray after replacing 0th index value:");
        for (int num : a){
            System.out.println("Do - While loop :" + num );
            break;
        }
//For-each Loop
        //Syntax: for ( initialization ( string x : a){}
        for (int x : a){
            System.out.println("for Each - Loop : " + x);
        }





    }
}


