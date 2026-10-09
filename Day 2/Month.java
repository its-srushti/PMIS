      
//       import java.util.Scanner;
//       public class conditions {
//         public static void main(String [] args){

        
      
//       Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the age");
//         int age = sc.nextInt();


//         if(age <18){
//             System.out.println("teenager");
//         }
//         else if (age > 20){
            
//             System.out.println("adult");

//         }
//         else{
//             System.out.println("old");
//         }
//     }
// }

  

        //natural numbers

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int i =0;
        // int sum=0;
        // while(i<=a){
        
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum of natural numbers up to " + a + " is: " + sum);
       
        // fehrenheit to celsius
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the temperature in Fahrenheit: ");
        // float fahrenheit = sc.nextFloat();
        // float celsius = (fahrenheit - 32) * 5/9;
        // System.out.println("Temperature in Celsius: " + celsius);

        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter the choice(1,2,3): ");
        // int a = sc.nextInt();
        // switch (a) {
        //     case 1:
        //         System.out.println("Namste");
        //         break;
        //     case 2:
        //         System.out.println("Hello");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid input");
            
        // }


  // swaitch case
        // enter month number and print month name
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the month number (1-12): ");
        // int month = sc.nextInt();
        // switch (month) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("February");
        //         break;
        //     case 3:
        //         System.out.println("March");
        //         break;
        //     case 4:
        //         System.out.println("April");
        //         break;
        //     case 5:
        //         System.out.println("May");
        //         break;
        //     case 6:
        //         System.out.println("June");
        //         break;
        //     case 7:
        //         System.out.println("July");
        //         break;
        //     case 8:
        //         System.out.println("August");
        //         break;
        //     case 9:
        //         System.out.println("September");
        //         break;
        //     case 10:
        //         System.out.println("October");
        //         break;
        //     case 11:
        //         System.out.println("November");
        //         break;
        //     case 12:
        //         System.out.println("December");
        //         break;
        //     default:
        //         System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        // }
      //  make calulator 
    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("Enter first number: ");
    //   float a = sc.nextFloat();
    //   System.out.println("Enter second number: ");
    //     float b = sc.nextFloat();
    //     System.out.println("Enter the operation (1.Add, 2.Subtract, 3.Multiply, 4.Divide): ");
    //     int choice = sc.nextInt();
    //     switch (choice) {
    //         case 1: 
    //             System.out.println("Result: " + (a + b));
    //             break;
    //         case 2:
    //             System.out.println("Result: " + (a - b));
    //             break;
    //         case 3:
    //             System.out.println("Result: " + (a * b));
    //             break;
    //         case 4:
    //             System.out.println("Result: " + (a / b));
    //             break;
    //             default:
    //             System.out.println("Invalid operation");

    //     }






    // ----------------------------

    // SELF PRACTICE
// without user input

// public class Days{
//       public static void main(String args[]){
//           int day=3;
//           switch(day)
//           {
//             case 1:
//               System.out.println("monday");
//               break;
//             case 2:
//               System.out.println("Tuesday");
//               break;
//             case 3:
//               System.out.println("Wednesday");
//               break;
//             case 4:
//               System.out.println("Thursday");
//               break;
//             case 5:
//               System.out.println("friday");
//               break;
//             case 6:
//               System.out.println("saturday");
//               break;
//             case 7:
//               System.out.println("sunday");
//               break;
//             default:
//               System.out.println("Invalid day");
//           } 
//    }
//   }

// with user input
// import java.util.Scanner;
// public class Days{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter your choice between (1 to 10):");
//     int day=sc.nextInt();
//     switch(day){
//       case 1:
//         System.out.println("monday");
//         break;
//       case 2:
//         System.out.println("tuesday");
//         break;
//       case 3:
//         System.out.println("Wednesday");
//         break;
//       case 4:
//         System.out.println("Thursday");
//         break;
//       case 5:
//         System.out.println("Friday");
//         break;
//       case 6:
//         System.out.println("saturday");
//         break;
//       case 7:
//         System.out.println("Sunday");
//         break;
//       default:
//         System.out.println("Invalid day");
//     }
//   }
// }

// --------------------------------------

// simple calculator
// public class Calculator{
//   public static void main(String args[]){
//     int a=20;
//     int b=10;
//     char op='+';
//     switch(op){
//       case '+':
//         System.out.println(a+b);
//         break;
//       case '-':
//         System.out.println(a-b);
//         break;
//       case '*':
//         System.out.println(a*b);
//         break;
//       case '/':
//         System.out.println(a/b);
//         break;
//       default:
//         System.out.println("Inavlid operator");
//     }
//   }
// }


// without user input
// import java.util.Scanner;
// public class Calculator{
//   public static void main(String args[])
//   {
//     Scanner sc =new Scanner(System.in);
//     System.out.println("enter first number");
//     int a=sc.nextInt();
//     System.out.println("enter second number");
//     int b=sc.nextInt();
//     System.out.println("enter your choice:(+,-,*,/)");
//     char op=sc.next().charAt(0);
//     switch(op){
//       case 1:
//         System.out.println(a+b);
//         break;
//       case 2:
//         System.out.println(a-b);
//         break;
//       case 3:
//         System.out.println(a*b);
//         break;
//       case 4:
//         System.out.println(a/b);
//     }

//   }
// }




// public class Month{
//   public static void main(String args[]){
//     int month=8;
//     switch(month){
//       case 1:
//         System.out.println("January");
//         break;
//       case 2:
//         System.out.println("February");
//         break;
//       case 3:
//         System.out.println("August");
//         break;
//       case 4:
//         System.out.println("December");
//         break;
//       default:
//         System.out.println("Invalid Month");
//     }
//   }
// }



// # by using user input
// import java.util.Scanner;
// public class Month{
//   public static void main(String args[]){
//       Scanner sc= new Scanner(System.in);
//       System.out.println("enter the month(1 to 12):");
//       int month=sc.nextInt();
//       switch(month){
//         case 1:
//           System.out.println("january");
//           break;

//         case 2:
//           System.out.println("february");
//           break;
        
//         case 3:
//           System.out.println("march");
//           break;
//         case 4:
//           System.out.println("April");
//           break;
//         case 5:
//           System.out.println("May");
//           break;

//         case 6:
//           System.out.println("June");
//           break;

//         case 7:
//           System.out.println("july");
//           break;
        
//         case 8:
//           System.out.println("August");
//           break;

//         case 9:
//           System.out.println("september");
//           break;
//         case 10:
//           System.out.println("octomber");
//           break;
//         case 11:
//           System.out.println("november");
//           break;
//         case 12:
//           System.out.println("December");
//       }
//   }
// }