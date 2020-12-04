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
//        Scanner input = new Scanner(System.in);
//        System.out.println("### LARGEST NUMBER CHECK ###"); 
//        System.out.println("Enter 1st NUMBER: "); 
//        float a = input.nextFloat();
//        System.out.println("Enter 2nd NUMBER: "); 
//        float b = input.nextFloat();
//        System.out.println("Enter 3rd NUMBER: "); 
//        float c = input.nextFloat();
//        float answer;
//        if((a > b) && (a > c)) answer = a;
//        else if((b > a) && (b > c)) answer = b;
//        else answer = c;
//        System.out.println(answer + " is the largest.");
//        

// LOOP RELATED

    //        SECTION LOOP TO NUMBER BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### LOOP TO NUMBER ###"); 
//        System.out.println("Enter the NUMBER: "); 
//        int a = input.nextInt();
//
//            for (int i = 1; i <= a; i++) {
//              System.out.println(i);
//            }
            
            
//             //        SECTION PRINT ODD NUMBER BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### ODD NUMBER ###"); 
//        System.out.println("Enter the NUMBER: "); 
//        int a = input.nextInt();
//
//            for (int i = 1; i <= a; i++) {
//                if(i % 2 != 0){
//                System.out.println(i);
//                }
//            }

   //        SECTION PRINT BINARY NUMBER BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### BINARY NUMBER ###"); 
//        System.out.println("Enter the Count of Numbers You want to do Average: "); 
//        int a = input.nextInt();
//        float sum = '0';
//        float current_num = '0';
//
//            for (int i = 1; i <= a; i++) {
//                System.out.println("Enter Number "+i);
//                current_num = input.nextFloat();
//                sum = sum + current_num;
//            }
//            
//            float avg = (sum / a);
//            System.out.println("The average is "+avg);
            
            
////             //        SECTION N Times Average BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### N Times Average Problem ###"); 
//        System.out.println("How many numbers to average?: "); 
//        int a = input.nextInt();
////        System.out.println("Enter Second Number: "); 
////        int b = input.nextInt();
//        float sum = '0';
//        float current_num = '0';
//        
//            for (int i = 1; i <= a; i++) {
//                System.out.println("Enter Number "+i);
//                current_num = input.nextFloat();
//                sum = sum + current_num;
//            }
//            
//        float avg = (sum / a);
//        System.out.println("The average is "+avg);

//        //        SECTION Square and Reach BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### Square and Reach Problem ###"); 
//        System.out.println("Enter 1st Number: "); 
//        int a = input.nextInt();
//        System.out.println("Enter 2nd Number: "); 
//        int b = input.nextInt();
//        float square = '0';
//        float new_a = '0';
//        
//            for (int i = 1; i != 0; i++) {
//                
//                if(a == b)
//                {
//                     System.out.println("Reached");
//                     break;
//                   
//                }
//                else if (a > b)
//                {
//                    System.out.println(a*a);
//                    a = a - 1;
//                }
//                 else
//                {
//                    System.out.println(a*a);
//                    a = a + 1;
//                }
//                
//                
//            }
            
////        SECTION 2 Players Guess BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### 2 Players Guess Problem ###"); 
//        System.out.println("Enter the secret number: "); 
//        int a = input.nextInt();
//        System.out.println("How many times Player 2 can try?: "); 
//        int b = input.nextInt();
//        int c = b;
//        float square = '0';
//        float new_a = '0';
//        int inp = '0';
//        
//            for (int i = 1; i <=c; i++) {
//                
//                
//                System.out.println("Player 2: Enter your guess: "); 
//                inp = input.nextInt();
//            
//                
//                
//                if(a == inp)
//                {
//                     System.out.println("Right, Player-2 wins!");
//                     break;
//                   
//                }
//                else 
//                {
//                    
//                    b = b - 1;
//                    System.out.println("Wrong, "+b+" Choice(s) Left!");
//                }
//                 
//                if(b == 0)
//                {
//                    System.out.println("Player 1 wins!");
//                }
//                
//                
//            }

//            //        SECTION Match A BLOCK
//        Scanner input = new Scanner(System.in);
//        System.out.println("### Match A Problem ###"); 
//        
//        char a;
//            for (int i = 1; i >=0; i++) {
//                
//                
//                System.out.println("Enter One Charecter: "); 
//                a = input.next().charAt(0);
//
//                if(a == 'A')
//                {
//                    break;
//                   
//                }
//                else 
//                {
//                    System.out.println(a);
//                }
//                
//            }
//        Scanner input = new Scanner(System.in);

////            //        SECTION INT REVERSE BLOCK
//                   System.out.println("### INT REVERSE Problem ###");
//                   System.out.println("Enter an integer: ");
//                   Scanner input = new Scanner(System.in);
//                   int a = input.nextInt();
//                   int reverse = 0;
//
//                   while(a != 0)
//                   {
//                     reverse = reverse * 10;
//                     reverse = reverse + a%10;
//                     a = a/10;
//                   }
//
//                   System.out.println("The Reverse is " + reverse);

////            //        SECTION SERIES CALCULATION BLOCK
//                   System.out.println("### SERIES CALCULATION Problem ###");
//                   System.out.println("Number of Terms: ");
//                   Scanner input = new Scanner(System.in);
//                   int a = input.nextInt();
//                   int sum = 0;
//
//                   
//                      for(int i = 0; i <= a ; i++)
//                    {
//                     
//                        if(i % 2 == 0)
//                            sum = sum - i;
//                        else
//                            sum = sum + i;
//                        
//                   }
//
//                   System.out.println("The sum is " + sum);
//
//
///            //        SECTION Febonacci BLOCK
                   System.out.println("### Febonacci Problem ###");
                   System.out.println("Number of Terms: ");
                   Scanner input = new Scanner(System.in);
                   int a = input.nextInt();
                    int n1=0,n2=1,n3;    
                     System.out.print(n1+" "+n2);//printing 0 and 1    

                     for(int i=2;i<a;++i)//loop starts from 2 because 0 and 1 are already printed    
                     {    
                      n3=n1+n2;    
                      System.out.print(" "+n3);    
                      n1=n2;    
                      n2=n3;    
                     }    


// Stop here

    }
    
    
}
