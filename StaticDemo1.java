// class Student{
//     String name;
//     static String collageName="IIT Bombay";
//     Student(name){
//         this.name=name;
//     }
//     void stucol(){

//     }
// }

// static method

// class Bank {
//     final void calculateInterest() {
//         System.out.println("Base interest calculation");
//     }
// }

// class Branch extends Bank {
//     void display() {
//         System.out.println("Branch details");
//     }
// }

// public class aa {
//     public static void main(String[] args) {
//         Branch b = new Branch();

//         b.calculateInterest();
//         b.display();
//     }
// }


// absytract method


// abstract class Shape{
//     private String colour;

//     void setColor(String colour){
//         this.colour=colour;
//     }
//     String getcolour(){
//         return colour;

//     }

//     abstract double calculateArea();
// }

// class Circle extends Shape{
//     double radius;

//     Circle(double radius){
//         this.radius=radius;

//     }
//     @Override 
//     double calculateArea(){
//         return(3.14)*radius*radius;
//     }
// }

// class Rectangle extends Shape{
//     double length,breadth;
//     Rectangle(double length,double breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     double calculateArea() {

//         return length*breadth;
//     }
// }

// class aa{
//     public static void main(String[] args) {
//         Shape c= new Circle(0.5);
//         Shape r= new Rectangle(12,6);
//         c.setColor("red");
//         r.setColor("blue");

//         System.out.printf("%s Circle area is %.2f",c.getcolour(),c.calculateArea());
//         System.out.printf("%s Rectangle area is %.2f",r.getcolour(),r.calculateArea());
//     }
// }




// Question: User Account Registration System (Static Variables and Static Methods)
// Scenario: A system needs to manage user registrations and maintain a count of the total number of users created. The total user count should be shared among all instances of the UserAccount class.
// Task:
// 1. Create a class named UserAccount with the following:
//    - A private instance variable String username to store the username.
//    - A private static variable int totalUsers, initialized to 0, to keep track of the total number of users created.
//    - A parameterized constructor that accepts a username, initializes the instance variable, and increments totalUsers whenever a new user is created.
//    - A getter method getUsername() to return the username.
//    - A static method getTotalUsers() to return the total number of users registered.
// 2. Create a main class named StaticDemo1 that:
//    - Displays the initial user count before creating any users.
//    - Creates three UserAccount objects with the usernames "Aarav", "Priya", and "Rohan".
//    - Displays the username of each newly created user.
//    - Displays the total number of users registered by calling the static method directly through the UserAccount class, without creating an additional object.

class UserAccount{
    private String Username;
    private static int totalUsers=0;

    UserAccount(String Username){
        this.Username=Username;
        totalUsers++;

    }
    public String getUsername(){
        return Username;
    }
    public static int gettotalUsers(){
        return totalUsers;
    }


}
public class StaticDemo1{
    public static void main(String[] args){
        // Display initial user count
        System.out.println("Initial user count: " + UserAccount.gettotalUsers());

        // Create three user accounts
        UserAccount u1 = new UserAccount("Aarav");
        UserAccount u2 = new UserAccount("Priya");
        UserAccount u3 = new UserAccount("Rohan");

        // Display usernames
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Username: " + u2.getUsername());
        System.out.println("Username: " + u3.getUsername());

        // Display total registered users
        System.out.println("Total users registered: " + UserAccount.gettotalUsers());
    }
}