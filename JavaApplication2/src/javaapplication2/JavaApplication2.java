/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author arif
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
                A superOb = new A();
                B subOb = new B();
                superOb.i = 10;
                superOb.j = 20;
                superOb.showij();
                subOb.i = 7;
                subOb.j = 8;
                subOb.k = 9;
                subOb.showij();
                subOb.showk();
                subOb.sum();

        
    }
    
}

class A {
int i, j;
    void showij() {
    System.out.println(i + " " + j); 
    }  
 }

class B extends A {
    int k;
    void showk() {
        System.out.println(k);
    }
    void sum() {
        System.out.println(i+j+k);
        }
}
