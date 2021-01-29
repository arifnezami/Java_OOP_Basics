package javaapplication3;


public class JavaApplication3 {
 public static void main(String args[]) 
{
  int arr[] = new int[10];
    
}
}



//class Callme
// {
//void call(String msg) 
//{
// System.out.print("[" + msg);
// try 
//{
// Thread.sleep(1000);
// } 
//catch(InterruptedException e)
// {
// System.out.println("Interrupted");
// }
// System.out.println("]");
// }
//}
//
//class Caller implements Runnable 
//{
// String msg;
// Callme target;
// Thread t;
// public Caller(Callme targ, String s) 
//{
// target = targ;
// msg = s;
// t = new Thread(this);
// t.start();
// }
// public void run() 
//{
// target.call(msg);
// }
//}
//public class JavaApplication3 
//{
// public static void main(String args[]) 
//{
// Callme target = new Callme();
// Caller ob1 = new Caller(target, "Hello");     //three objects are accessing call(msg) at the same time called race condition
// Caller ob2 = new Caller(target, "Synchronized");
// Caller ob3 = new Caller(target, "World");
// // wait for threads to end
// 
// }
//}

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication3;
//
///**
// *
// * @author arif
// */
//
//class Base {
//    Base() {
//        System.out.println("12.");
//    }
//}
//
//class Derived extends Base {
//    Derived() {
//        System.out.println("34.");
//    }
//}
//
//public class JavaApplication3 {
//
//    /**
//     * @param args the command line arguments
//     */
//   public static void main(String args[]) {
//       Derived d = new Derived();
////       
////
////try {
////// initializing array
////int a[] = {1,2,3,4,5};
////// trying to print element at index S
////System.out.println(a[5]);
////// try-block2 inside another try block
////try {
////// performing division by zero
////int x = a[2] / 0;
////}
////catch (ArithmeticException e2) {
////System.out.println("Main thread interrupted.");
////        }
////}
////catch (ArrayIndexOutOfBoundsException e1) {
////System.out.println("ArrayIndexOutofBoundsException.");
////System.out.println("Element at suck index doesnot exists.");
////   
////
////   }
////   
////
////      
////       
//  }
//}
