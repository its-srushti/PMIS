// public class ThreadDemo1 extends Thread{
//     public void run(){
//         System.out.println("thread is running");
//     }
//     public static void main(String[] args){
//         ThreadDemo1 obj=new ThreadDemo1();
//         obj.start(); // it calls the run method
//     }
// }  //constructor of method without parameter


//#thread with string name

// public class ThreadDemo3{
//     public static void main(String[] args) {
//             Thread t=new Thread("My first thread");
//             t.start();
//             String str=t.getName();
//             System.out.println(str);
//     }
// }



// Thread plus Runnable interface

// public class ThreadDemo2 implements Runnable{
//     public void run(){
//         System.out.println("thread is running");
// }
//     public static void main(String[] args) {
//         // Runnable obj=new ThreadDemo2();
//         ThreadDemo2 obj=new ThreadDemo2();
//         Thread t1=new Thread(obj);
//         t1.start();
//     }
// }


//  last one


// enum=we have mention variable in upper class ....we use to store constant value



// setPriority() 

public class ThreadPriorityeX extends Thread{
    public void run(){
        System.out.println("inside the run method");
    }
    public static void main(String[] args) {
        
        ThreadPriorityeX th1=new ThreadPriorityeX();
        ThreadPriorityeX th2=new ThreadPriorityeX();
        ThreadPriorityeX th3=new ThreadPriorityeX();

        System.out.println("priority of th1 is "+th1.getPriority());
        System.out.println("priority of th2 is"+th2.getPriority());
        System.out.println("the priority of th3 is"+th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority();

        System.out.printl
        n("currently executing the thread"+Thread.currentThread());
    }
}







// static method---which will belong to  class

// local -----var declared inside the method only
// instance---obj is required
// static-----declare in side class but outside method ...static keyword is used to save the memory is takes memory at the time of object creation
//  static variable method/block
// var declaration---datatype varname=value;

// local methopod
// class a{
//     void add(int a ,int b){
//         int z=x+y
//         sout(z)
//     }
// }
// it wont access outside the method 


// instance
// class a
//     int x=5  //access outside the method and required object creation
//     void add()
//     {

//     }
//     void mul()
// }


// static ---object creation is not reqired --it only use classanme



// instance convert into static
// insance
// class demo{
//     int x=5;
//     void input(){
//         //block of code
//     }
    
// }
// public static void main(String[] args){
//     demo d= new demo();
//     d.input();
//     System.out.println(d.x);
// }

// static
// class demo{
//     static int x=5;
//     static void input(){
//         //block of code
//     }
    
// }
// public static void main(String[] args){
//     // call by using 2 ways
//     // 1 access directly within same class
//     // 22 using classname when multiple classes
//     input();
//     System.out.println(x);
// }


// static
// 2 nd way
// class demo{
//     static int x=5;
//     static void input(){
//         //block of code
//     }
    
    
// }Class A
// public static void main(String[] args){
//     // call by using 2 ways
//     // 1 access directly within same class
//     // 22 using classname when multiple classes
//     Demo.input();
//     System.out.println(Demo.x);
// }



// static bloc how to call it

// class Demo{
//     static int x=5
//     static void input()
//     {

//     }
//     static
// }
// x:---it will execute first main method then static block and then var name then method 



// no need to call explicitely




