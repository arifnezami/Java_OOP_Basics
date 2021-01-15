/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author arif
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
       
       

try {
// initializing array
int a[] = {1,2,3,4,5};
// trying to print element at index S
System.out.println(a[5]);
// try-block2 inside another try block
try {
// performing division by zero
int x = a[2] / 0;
}
catch (ArithmeticException e2) {
System.out.println("Main thread interrupted.");
        }
}
catch (ArrayIndexOutOfBoundsException e1) {
System.out.println("ArrayIndexOutofBoundsException.");
System.out.println("Element at suck index doesnot exists.");
   

   }
   

      
       
  }
}
