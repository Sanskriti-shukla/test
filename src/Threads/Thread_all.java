package Threads;
class Thread1 extends Thread{
     public void run(){
         try {
             System.out.println("Thread" + " " + Thread.currentThread().getId() + " running"); }
            catch (Exception e) {
        System.out.println("Exception is caught");
         } }}
class java extends Thread{
    public void run(){
        try {
            System.out.println("Thread" + " " + Thread.currentThread().getId() + "not running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }}}
public class Thread_all {
    public static void main(String[] args) {
  int n=8;
  for (int i=1; i<n; i++){
      Thread1 T1= new Thread1();
      java j=new java();
      j.start();
//      if we will do it then it will not execute j.start().
//      j.stop();
//      will not execute new threads....
//      T1.run();
//      T1.run();
//      will execute multiple threads...
     T1.start();
//     T1.start() will not execute...
//      T1.stop();
//      T1.join(j);
  }}}
//If we extend the Thread class,
// our class cannot extend any other class because Java doesn’t support multiple inheritance.
// But, if we implement the Runnable interface,
// our class can still extend other base classes.