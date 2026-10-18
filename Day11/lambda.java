
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// PROGRAM 1: Runnable Lambda
class Program1 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Java");
        r.run();
    }
}

// // PROGRAM 2: Greeter Lambda
// @FunctionalInterface
// interface Greeter {
//     void greet(String name);
// }

// class Program2 {
//     public static void main(String[] args) {
//         Greeter g = name -> System.out.println("Hello " + name);
//         g.greet("Srushti");
//     }
// }

// // PROGRAM 3: Predicate
// class Program3 {
//     public static void main(String[] args) {
//         Predicate<Integer> isAdult = age -> age >= 18;
//         System.out.println(isAdult.test(21));
//     }
// }

// // PROGRAM 4: Function - String Length
// class Program4 {
//     public static void main(String[] args) {
//         Function<String, Integer> length = str -> str.length();
//         System.out.println(length.apply("Srushti"));
//     }
// }

// // PROGRAM 5: Function - Square Root
// class Program5 {
//     public static void main(String[] args) {
//         Function<Integer, Double> squareRoot = n -> Math.sqrt(n);
//         System.out.println(squareRoot.apply(25));
//     }
// }

// // PROGRAM 6: Consumer
// class Program6 {
//     public static void main(String[] args) {
//         Consumer<String> print = message -> System.out.println(message);
//         print.accept("Welcome to Java");
//     }
// }

// // PROGRAM 7: Supplier
// class Program7 {
//     public static void main(String[] args) {
//         Supplier<String> message = () -> "Hello Srushti";
//         System.out.println(message.get());
//     }
// }

// // PROGRAM 8: Consumer - Notification
// class Program8 {
//     public static void main(String[] args) {
//         Consumer<String> notification =
//                 name -> System.out.println("Welcome " + name);

//         notification.accept("Srushti");
//     }
// }

// // PROGRAM 9: Generate Six-Digit OTP
// class Program9 {
//     public static void main(String[] args) {
//         Random random = new Random();
//         Supplier<Integer> otp =
//                 () -> 100000 + random.nextInt(900000);

//         System.out.println(otp.get());
//     }
// }

// // PROGRAM 10: Even Numbers and Squares Using Loop
// class Program10 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

//         for (int n : nums) {
//             if (n % 2 == 0) {
//                 System.out.println(n * n);
//             }
//         }
//     }
// }

// // PROGRAM 11: Even Numbers and Squares Using Streams
// class Program11 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

//         nums.stream()
//             .filter(n -> n % 2 == 0)
//             .map(n -> n * n)
//             .forEach(System.out::println);
//     }
// }

// // PROGRAM 12: Different Ways to Create Streams
// class Program12 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//         nums.stream().forEach(System.out::println);

//         Integer[] arr = {10, 20, 30};
//         Arrays.stream(arr).forEach(System.out::println);

//         Stream.of("Java", "Python", "SQL")
//               .forEach(System.out::println);

//         IntStream.range(1, 5).forEach(System.out::println);
//     }
// }

// // PROGRAM 13: Filter Numbers Greater Than or Equal to 7
// class Program13 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(2, 5, 7, 9, 3, 10);

//         nums.stream()
//             .filter(n -> n >= 7)
//             .forEach(System.out::println);
//     }
// }

// // PROGRAM 14: Multiply Numbers by 2
// class Program14 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(5, 12, 8, 3, 4);

//         List<Integer> result = nums.stream()
//                 .map(n -> n * 2)
//                 .collect(Collectors.toList());

//         System.out.println(result);
//     }
// }

// // PROGRAM 15: Sort Words by Length
// class Program15 {
//     public static void main(String[] args) {
//         List<String> words =
//                 Arrays.asList("Java", "C", "Python", "SQL");

//         List<String> sorted = words.stream()
//                 .sorted((a, b) -> a.length() - b.length())
//                 .collect(Collectors.toList());

//         System.out.println(sorted);
//     }
// }

// // PROGRAM 16: Sort Numbers in Ascending Order
// class Program16 {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(5, 2, 8, 1, 4);

//         List<Integer> sorted = nums.stream()
//                 .sorted()
//                 .collect(Collectors.toList());

//         System.out.println(sorted);
//     }
// }

// MAIN CLASS: Choose Which Program to Run
public class lambda {
    public static void main(String[] args) {
        Program1.main(args);  // Change Program1 to another class
    }
}