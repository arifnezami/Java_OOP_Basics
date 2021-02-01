/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct1;

/**
 *
 * @author arif
 */



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


public class Ct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    Super x = new Super();
    Sub y = new Sub();
    SubSub z = new SubSub();
  
    x.print(2);
    x=y;
    x.print();
    y=z;
    y.print(3);
    z.print();
        
        
    }
    
}
