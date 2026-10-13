// arithmatic exeption
// null pointer
// arrayout of bounds exception by using try and catch block

// class exception{
//     public static void main(String[] args){
//         int a=10;
//         int b=0;

//         try{
//             int rest=a/b;
//             System.out.println(rest);

//         }catch(ArithmeticException e){
//             System.out.println("you cannot divide by 0");
//         }
//     }
// }

// //Arithmetic exception
// Trying to divide an integer by zero
// 10/0

// null pointer excepton
// trying to access a method or field through a null reference
// String name=null;
// calling an instance method on a null object()eg.,str.length() ewhen str is null)
// accessing or modifying a fielf of a null object(eg user.name)
// taking the length of a null array or accessing its sun.net.www.protocol.http.spnego
// array index out of bounds exception
// // accessing 


// class excdeption{
//     public static void main(String[] args){

//         int a=10;
//         int b=0;
//         int res=a/b;
//         try{
//             int num=10/0;
//             System.out.println(num);

//         }catch(ArithmeticException e){
//             System.out.println("Do not divide by 0 ");
//             System.out.println("the eror type was:"+e);       
//         }

//     }
// }




// class exception{
//     public static void main(String[] args){
//         try{
//             int res=10/0;
//             System.out.println(res);
//             int[] numbers={10,20,30};
//             System.out.println(numbers[5]);

//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Invalid array index");

//         }catch(ArithmeticException e){
//             System.out.println("Cannot divide by 0");
//         }
//     }
// }


// finally keyword/block
// it acts like a closing statement
// whether a error occurs or not finally will execute

// class exception{
//     public static void main(String[] args) {
//         // finally:clossing statement
//         try{
//             int res=10/0;
//         }catch(ArithmeticException e){
//             System.out.println("cannot divide by 0");
//         }finally{
//             System.out.println("finally block executed");
//         }
//     }
// }


// import java.util.*;
// class exception{
//     public static void main(String[] args) {
//         System.out.println("enter age");
//         Scanner sc=new Scanner(System.in);

//         int age=sc.nextInt();

//         if(age< 0){
//             throw new IllegalArgumentException(
//                 "Age cannot be negative"
//             );
//         }
//         System.out.println("age"+age);
//     }
// }


// throws   use for giving a warning

// import java.io.FileReader;
// import java.io.IOException;

// class exception{
//     static void readFile() throws IOException{
//         FileReader file=new FileReader("data.txt");
//         System.out.println("file opened");
//     }
//     public static void main(String[] args) {
//         try{
//             readFile();
//         }catch(IOException e){
//             System.out.println("could not find the file");
//         }
        
//     }
// }


// --------------------------------
// ATM withdrawal system
// class exception{
//     public static void main(String[] args){
//         int balance=5000;
//         int withdrawal=7000;

//         try{
//             if(withdrawal>balance){
//                 throw new IllegalArgumentException("insufficient balance");
//             }
//             balance-=withdrawal;
//             System.out.println("withdrawal was successful");
//             System.out.println("remaining balance"+balance);
//         }catch( IllegalArgumentException e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println("program completed");
//     }
// }



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}
