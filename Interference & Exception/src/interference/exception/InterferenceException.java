/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interference.exception;

/**
 *
 * @author arif
 */

// class Base {
//     Base() {
//   System.out.println("Base"); 
// }
// }
//  
//class Derived extends Base {
//   Derived(){
//       System.out.println("Derived"); } 
//}

/**
Suppose, you are developing a software for calculating earnings of different types of teaching assistants. There are 2 types of TeachingAssistant: Grader, LabAssistant. A grader assists teacher by checking assignment scripts, whereas a lab assistant helps the teacher by helping the students in the lab.
Class TeachingAssistant has two attributes: name and id. The constructor of TeachingAssistant class initializes name and id with this reference keyword. There is one method named void printEarnings() which prints the name and id of the TeachingAssistant. The classes that extend TeachingAssistant are Grader and LabAssistant. Grader class overrides printEarnings() method. This method first invokes parent method and then prints the earning of grader by multiplying the number of graded assignments with per- assignment pay. To do so, you should include two instance variables in Grader class definition: count, payPerAssignment.
LabAssistant class also overrides printEarnings() in similar way except that a lab assistant is paid on an hourly basis. The earning is thus calculated by multiplying total number of hours he spends in the lab by the hourly payment. In order to do so, include two instance variables in LabAssistant class: hour and hourlyPay.
Your task is to write the complete code of these three classes. Do the necessary initializations through using appropriate constructors for each class from the main method.
 */



 class TeachingAssistant {
    // Instance variables
 public String name;
 public String id;

 // Constructor
public TeachingAssistant(String name, String id) {
 this.name = name;
 this.id = id;
 
 }
 void printEarnings()
 {
     System.out.println("Name: "+name+" ID: "+id); 
 }
}


class grader extends TeachingAssistant {
    
    int count;
    int payPerAssignment;

    public grader(String name, String id) {
        super(name, id);
    }
    
    @Override
    void printEarnings() {
    System.out.println("Name: "+name+" ID: "+id + " Assignment-wise paynment : "+ count * payPerAssignment); 
 }
}


class LabAssistant extends TeachingAssistant {
    int hour;
    int hourlyPay;

    public LabAssistant(String name, String id) {
        super(name, id);
    }
    
    @Override
    void printEarnings() {
    System.out.println("Name: "+name+" ID: "+id + " Hourly Payment: "+ hour * hourlyPay); 
 }
}
 
  

public class InterferenceException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //
        LabAssistant LA = new LabAssistant("Arif","001");
        LA.hour = 10;
        LA.hourlyPay = 3;
        LA.printEarnings();
        
        grader GA = new grader("Nezami","002");
        GA.count = 34;
        GA.payPerAssignment = 2;
        GA.printEarnings();
        
         //grader GA = new grader();
        
        
        //
   
  // Derived d = new Derived();
       
    
// try
// {
//int a[] = {1, 2, 3, 4};
//for (int i = 1; i <=4; i++)
//{
//System.out.println("a[" + i + "] = " + a[i] + "\n");        }
//        }
//
//catch (ArrayIndexOutOfBoundsException e)
//{
//System.out.printf("ArrayIndexOutOfBoundsException");      
//}
// catch (Exception e)
//{
//System.out.printf("error = " +e) ;
//}
        
        
//try
//{
//System.out.printf("1") ;
//int sum = 9 / 0;
//System.out.printf("2") ;
//}
//catch(ArithmeticException e)
//{
//System.out.printf("3") ;
//}
//catch(Exception e)
//{
//System. out. printf ( "4" ) ;
//}
//finally
//{
//System.out.printf("5") ;
//}

    
    
    }
    
}
