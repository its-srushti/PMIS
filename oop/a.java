// structure of java program
/* 
public class a {
    public static void main(String[] args){
        //implementation
        System.out.println("hello");
    }
    
}
*/

/* 
class A {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.add(10, 20));
    }

    int add(int a, int b) {
        return a + b;
    }
}
*/

//num to bin
/*
class a{
  public static void main(String[] args) {
    int num=127;
    String bin=" ";
    int rem=0;
    rem=num%2;
    bin=rem+bin;
    num=num/2;
    rem=num%2;
    bin=rem+bin;
    num=num/2;
    rem=num%2;
    bin=rem+bin;
    num=num%2;
    bin=rem+bin;
    num=num/2;
    System.out.println("num"+num);
    System.out.println("rem"+rem);
  }
}
  */

// Byte ex
/* 
class a{
    public static void main(String[] args){
        byte a=1;
        short b=a;
        int c=a;
        long d=a;
        float e=a;
        double f=a;
        // char g=a; lossy coonversion not possible
        // Boolean h=a; not possible


    }
}
    */


//short  
// write a program to find range of short using swapper class short

// class a{
//     public static void main(String[] args) {
//         System.out.println("min value"+ Short.MIN_VALUE);
//         System.out.println("max value"+ Short.MAX_VALUE);

    
    
//     }
// }

/* 

class a{
    public static void main(String[] args){

    Short a=1; // r
    // byte b=a  //X
    int c=a;
    // char d=a;//X
    long e=a;
    float f=a;
    double g=a;
    // boolean h=a//cannot be converted
    String j=a+"";
    // String i=a;//cannot be converted

    }
}

*/


//short with constant or variable
// class a{
//     public static void main(String[] args) {
//         Short a=10*10;
//         byte b=2;
//         // Short c=20+b;
//     }
// }



// class a{
//     public static void main(String[] args) {
//         String name="india population";
//         int totalpopulation=1474823324;
//         int female=(int)(totalpopulation/100.0*48.46);
//         int male=totalpopulation-female;
//         int voter=9779660;
//         System.out.println(female);


//     }
// }


// class a{
//     public static void main(String[] args){
//         String appName="zomato";
//         int restaurant=300000;
//         int riders=35000;
//         int delivery=13000;
//         int homeDel=(int)(delivery/100.0*70);
//         int deilvout=delivery- homeDel;
//     }
// }


// class a{
//     public static void main(String[] args) {
//         int price=999;
//         int discount=(int)(price*33.33/100);
//         int fprice=price-discount;
//         System.out.println(fprice);
//     }
// }


// class a{
//     public static void main(String[] args) {
//         System.out.println("min"+Long.MIN_VALUE);
//         System.out.println("MAX"+Long.MAX_VALUE);
//     }
// }


// 


// class wheatherex{
//     public static void main(String[] args) {
//         float temperatre=30.5f;
//         float aqi=70.3f;
//         float windspeed=12.75f;
//         float humidity=65.5f;

//     }
// }



// class  personalinnfo{
//     public static void main(String[] args) {
//         float height=5.9f;
//         float age=23.5f;
//         float weight=73.2f;
//         float bmi=22.3f;
//         float heartrate=72.5f;
//         float bodyfat=18.5f;

//     }
// }



// class a{
//     public static void main(String[] args) {
//         System.out.println("min"+Double.MIN_VALUE);
//         System.out.println("MAX"+Double.MAX_VALUE);
//     }
// }


// class a{
//     public static void main(String[] args) {
//         double principal=50000.75;
//         double rate=7.5;
//         double time=3.5;
//         double SI=(principal*rate*time)/100;
//         double paidamount=10000.50;
//         double outstanding= totalamount-paidamount;

//     }
// }




// //string
// String c="hello";
// String b="hrllo";
// c.equals(b);
// hello.equals("hello");