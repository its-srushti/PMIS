// code witthout lambda

// import javax.sound.sampled.SourceDataLine;

// @FunctionalInterface 
// interface Greeter{
//     void greet(String name);
// }
// public class lambda{
//     public static void main(String[] args){
// {
//     Greeter g= new Greeter() {
//         System.out.println("hello"+name);
//         }
//     };
//     g.greet("srushti");
    
// }
// }



// package Day11;

/* 
@FunctionalInterface 
interface Greeter{
    void greet(String name);
}
public class lambda{
    public static void main(String[] args){
        Greeter g= name -> {System.out.println("hello"+name);
        System.out.println("welcome back");
    };   //use curly braces for multiple lines otherwise avoid it
        g.greet("srushti");
    }

}


*/


// no parameters:()->syso("Hi")
// One parameter:x-> x*2
// two parameters: (a,b)-> a+b;
//(int a,intb)-->a+b



// // built  in fucntion interface
// predicate<T> test(t) T->t/f 1/0
// function<T,R> :applu(t);T->R
// consumer<T> : r -> "hello,hii"

// import java.util.*;
// import java.util.function.Predicate;
// public class lambda{
//     public static void main(String[] args) {
//         Predicate<Integer> isAdult =age -> age>=18;
//         System.out.println(isAdult.test(20));
//         System.out.println(isAdult.test(15));
//     }
// }



// import java.util.function.*;
// import java.util.*;
// class lambda{
//     public static void main(String[] args){
//         Function<String,Integer>getLength = name -> name.length();
//         System.out.println(getLength.apply("java"));
//         System.out.println(getLength.apply("john"));

//     }
// }


// import java.util.function.*;
// import java.util.*;
// class lambda{

//     public static void main(String[] args){
//         Function<Integer,Double>geFunction =math -> Math.sqrt(math);
//         System.out.println(geFunction.apply(3));

//     }
// }



// import java.util.function.*;
// class lambda{
//     public static void main(String[ ] args){
//         Consumer<String> pr =message -> System.out.println("message");

//     pr.accept("hello i love cricket");
//     }
// }




// import java.util.function.*;

// class Lambda {
//     public static void main(String[] args) {

//         Supplier<String> message = () -> "Welcome to ";

//         System.out.println(message.get());
//     }
// }




// import java.util.function.*;
// class lambda{
//     public static void main(String[] args){
//         Consumer<String> smsNotifier = mobNo ->{
//             System.out.println("sending otp to the ph no.: "+ mobNo);
//         };
//         smsNotifier.accept("+91 12345567567");
//     }
// }





// import java.util.function.*;
// import java.util.Random;

// class lambda{
//     public static void main(String[] args){
//         Supplier<String> otpGen =() ->{
//             Random random=new Random();
//             int number=100000+ random.nextInt(9000000);
//             return String.valueOf(number);

//         };
//         String userOtp=otpGen.get();
//         System.out.println("the otp is"+userOtp);
//     }
// }



// import java.util.*;
// class lambda{
//     public static void main(String[] args){
//         List<Integer> nums=Arrays.asList(
//         1,2,3,4,5,5);

//     };
//     List<Integer> result=new ArrayList<>();

//     for (int n: nums){
//         if(n%2==0){
//             result.add(n*n);
//         }
//     }
// }


// import java.util.*;
// import java.util.stream.*;
// class lambda{
//     public static void main(String args){
//         List<Integer> nums =Arrays.asList(1,2,3,4,5,5);

//         List<Integer> res=nums.stream()
//         .filter(n -> n%2 ==0)
//         .map(n -> n*n)
//         .collect(Collectors.toList());
//         System.out.println("OG List:"+nums);
//         System.out.println("Result"+res);
//     }
// }

/*  source (where the data comes from)[my-list.stream()]
->intermediate operations(transfor/filter){.filter(),.map()...}
->terminal operations(produce final result)[.collect(),.count()]
*/

// import java.util.*;
// import java.util.stream.*;

// class lambda{
//     public static void main(String[] args){
//         List<String>list= List.of("a","b","c");
//         System.out.println("System from a list:");
//         list.stream().forEach(System.out::println);
//         int[] arr={1,2,3};
//         Arrays.stream(arr).forEach(System.out::println);
//         Stream.of("x","y","z").forEach(System.out::println);
//         IntStream.range(1,5).forEach(System.out::println);    //1 to 4 end value is excluded


//     }
// }
// import java.util.*;
// import java.util.stream.*;

// class lambda{
//     public static void main(String[] args){
//         // filter keep all the item that pass a defined test
//         List<Integer> nums = List.of(5,12,8,3,20,7);
//         List<Integer>result=nums.stream()
//         .filter(n -> n>=7)
//         .collect(Collectors.toList());
//         System.out.println(result);
//     }
// }

// import java.util.List;


// class lambda{
//     public static void main(String[] args){
//         List<Integer> nums=List.of(5,12,8,3,4,5);
//         List<Integer> res=nums.stream()
//         .map(n -> n*2)// intermediate operation
//         .collect(Collectors.toList());
//         System.out.println(res);

//     }
// }


import java.util.stream.*;
class lambda{
    public static void main(String[] args){
        //sorted
        List<Integer> nums=List.of(5,4,3,2,1,19);
        List<String> words=List.of("banana","fig","apple","kiwi");
        List<String>byLength=words.stream()
        .sorted(a,b)  -> a.length() - b.length()
        .collect(Collectors.toList());

        List<Integer>res=nums.stream()
        sorted()
        .collect(Collectors.toList());
        System.out.pritnln(res);
        System.out.printlnbyLength):
}
}