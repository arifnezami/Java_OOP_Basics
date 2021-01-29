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

//  class A
//{
// A(){String s = "Class A";}
//}
//class B extends A
//{
// String s = "Class B";
// B (){
// System.out.println(s);
// }
//}
//class C extends B
//{
// String s = "Class C";
// C (){
// System.out.println(s);
// }
//}

class Super {
    void print(int a){
        System.out.println("super: "+ a);
    }
    void print(){
        System.out.println("inside sub");
    }
}

class Sub extends Super {
    void print(int a){
        System.out.println("super: "+ a);
    }
    void print(){
        System.out.println("inside sub");
    }
}

class SubSub extends Sub {
    void print(int a){
        System.out.println("super: "+ a);
    }
    void print(){
        System.out.println("inside sub");
    }
}

class A {
    public A(){
        System.out.println("A1");
    }
    public void print(){
        System.out.println("A2");
    }
}

class B extends A {
    public B(){
        System.out.println("B1");
    }
    public void print(){
        System.out.println("B2");
    }
}

class C extends B {
    public C(){
        System.out.println("C1");
    }
    public void print(){
        System.out.println("C2");
    }
}



public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
  
    
    public static void main(String[] args) {
        
        
        A ob = new C();
        
        ob.print();
//        int arr[] = new int[10];
//        
//        arr[9] = 5;
        // TODO code application logic here
//          Super x = new Super();
//    Sub y = new Sub();
//    SubSub z = new SubSub();
//  
//    x.print(2);
//    x=y;
//    x.print();
//    y=z;
//    y.print(3);
//    z.print();
//        C c = new C();
//    System.out.println(c.s);
//                A superOb = new A();
//                B subOb = new B();
//                superOb.i = 10;
//                superOb.j = 20;
//                superOb.showij();
//                subOb.i = 7;
//                subOb.j = 8;
//                subOb.k = 9;
//                subOb.showij();
//                superOb.showij();
//                superOb.i = 7;
//                superOb.showij();
//                subOb.showij();
//               // subOb.showk();
//               // subOb.sum();
                

        
    }
    
}

//class A {
//int i, j;
//    void showij() {
//    System.out.println(i + " " + j); 
//    }  
// }
//
//class B extends A {
//    int k;
//    void showk() {
//        System.out.println(k);
//    }
//    void sum() {
//        System.out.println(i+j+k);
//        }
//}


