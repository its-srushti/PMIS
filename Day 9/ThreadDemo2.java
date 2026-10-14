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

public class ThreadDemo2 implements Runnable{
    public void run(){
        System.out.println("thread is running");
}
    public static void main(String[] args) {
        // Runnable obj=new ThreadDemo2();
        ThreadDemo2 obj=new ThreadDemo2();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
