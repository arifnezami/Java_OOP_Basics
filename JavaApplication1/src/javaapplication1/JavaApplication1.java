/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*; 

/**
 *
 * @author arifnezami
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SECTION BASIC BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: "); 
//        int a = input.nextInt();
//        System.out.println("Your Input is: " +a);
        
        //  SECTION STRING INPUT
//            Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
//            System.out.print("Enter a string: ");  
//            String str= sc.nextLine();              //reads string   
//            System.out.print("You have entered: "+str);    

//        SECTION POSITIVE NEGETIVE BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### Positive Negetive Check ###"); 
//        System.out.print("Enter a Number: "); 
//        float a = input.nextFloat();
//        String answer;
//        if(a >= 0)
//        {
//            answer = "Positive";
//        }
//         else
//            answer = "Negetive";
//        System.out.println("Your Input is: " +answer);
        
        //        SECTION EVEN ODD BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### EVEN ODD Check ###"); 
//        System.out.print("Enter a Number: "); 
//        float a = input.nextFloat();
//        String answer;
//        if(a % 2 == 0)
//        {
//            answer = "Even";
//        }
//         else
//            answer = "Odd";
//        System.out.println("Your Input is: " +answer);

        //        SECTION POWER OF TWO BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### POWER OF TWO Check ###"); 
//        System.out.print("Enter a Number: "); 
//        int a = input.nextInt();
//        String answer;
//        if((a & (a - 1)) == 0)
//        {
//            answer = "Power of Two.";
//        }
//         else
//            answer = "Not a Power of Two";
//        System.out.println("Your Input is " +answer);
        
        //        SECTION LEAP YEAR BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### LEAP YEAR Check ###"); 
//        System.out.print("Enter a Number: "); 
//        int a = input.nextInt();
//        String answer;
//        if(( a % 4 == 0 && a % 100 != 0 )   ||  ( a % 400 ==0 ))
//        {
//            answer = "Yes";
//        }
//         else
//            answer = "No";
//        System.out.println(answer);

//        SECTION 180 DEGREE BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### 180 DEGREE CHECK ###"); 
//        System.out.println("Enter 1st ANGLE: "); 
//        float a = input.nextFloat();
//        System.out.println("Enter 2nd ANGLE: "); 
//        float b = input.nextFloat();
//        System.out.println("Enter 3rd ANGLE: "); 
//        float c = input.nextFloat();
//        String answer;
//        if((a + b + c) == 180) answer = "Yes";
//        else answer = "No";
//        System.out.println(answer);
        
        //        SECTION LARGEST NUMBER CHECK BLOCK
        Scanner input = new Scanner(System.in);
        System.out.println("### LARGEST NUMBER CHECK ###"); 
        System.out.println("Enter 1st NUMBER: "); 
        float a = input.nextFloat();
        System.out.println("Enter 2nd NUMBER: "); 
        float b = input.nextFloat();
        System.out.println("Enter 3rd NUMBER: "); 
        float c = input.nextFloat();
        float answer;
        if((a > b) && (a > c)) answer = a;
        else if((b > a) && (b > c)) answer = b;
        else answer = c;
        System.out.println(answer + " is the largest.");
        

    }
    
}
