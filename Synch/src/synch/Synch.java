/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

/**
 *
 * @author arif
 */
class Callme
 {
void call(String msg) 
{
 System.out.print("[" + msg);
 try 
{
 Thread.sleep(1000);
 } 
catch(InterruptedException e)
 {
 System.out.println("Interrupted");
 }
 System.out.println("]");
 }
}

class Caller implements Runnable 
{
 String msg;
 Callme target;
 Thread t;
 public Caller(Callme targ, String s) 
{
 target = targ;
 msg = s;
 t = new Thread(this);
 t.start();
 }
 public void run() 
{
 target.call(msg);
 }
}
public class Synch
{
 public static void main(String args[]) 
{
 Callme target = new Callme();
 Caller ob1 = new Caller(target, "Hello");     //three objects are accessing call(msg) at the same time called race condition
 Caller ob2 = new Caller(target, "Synchronized");
 Caller ob3 = new Caller(target, "World");
 // wait for threads to end
 
 }
}