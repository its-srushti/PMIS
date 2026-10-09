// single level inheritance
// in single level inheritance there is only one child class and only one parent class
// class Animal{
//     void eat(){
//         System.out.println("this animal eats food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("the dog barks");
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         Dog myDog= new Dog();
//         myDog.bark();
//     }
// }

// in this by using entends keyword we are extending animal class 



// -----------------------------------------------


// #multilevel inheritance
// there is multiple child classes in multilevel inheritance
// class Device{
//     void powerOn(){
//         System.out.println("calling number");
//     }
// }
// class Phone extends Device{
//     void makeCall(){
//         System.out.println("calling the number");
//     }
// }
// class SmartPhone extends Phone{
//     void browseInternet(){
//         System.out.println("Opening browser");
//     }

// }
// public class demo{
//     public static void main(String[] args){
//         SmartPhone samsingh=new SmartPhone();
//         samsingh.browseInternet();
//         samsingh.makeCall();
//         samsingh.powerOn();
//     }
// }




// ----------------------------
// herarchical inheritance
/*
  \  a
  \  |\
  \  b c
*/
// one parent class is accesed by multiple child classes
// common parent
// class Shape{
//     String color="Blue";
// }

// // firsst child
// class Circle extends Shape{
//     void drawCircle(){
//         System.out.println("Drawing a"+color+"circle");
//     }
// }
// // second child
// class Rectangle extends Shape{
//     void drawRectangle(){
//         System.out.println("Drawing a"+color+"rectangle");
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         Circle c= new Circle();    //#for every child class we have to create the objects 
//         Rectangle r=new Rectangle();

//         c.drawCircle();
//         r.drawRectangle();
//     }
// }



// multiple inheritance 
// not supported by java
// class Mother{
//     void message(){
//         System.out.println("message from mom");
//     }
// }

// class Father{
//     void message(){
//         System.out.println("message from dad");
//     }
// }

// class Child extends Mother,Father{    //it creates ambiguity
//     void a(){
//         System.out.println("aaa");
//     }
// }

// this is why java wont support multiple inheritance

// interface Mother{
//     void message();
// }
// interface Father{
//     void message();
// }
// class Child implements Mother,Father{   //we also can use interface rather than implements
//     @Override 
//     public void message(){
//         System.out.println("Loving both mom and dad");
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         Child c= new Child();
//         c.message();
//         Mother m=new Child();
//         m.message();
//         Father f=new Child();
//         f.message();
//     }
// }



// super keyword in inheritance why we use

// class Employee{
//     double salary=30000;
// }
// class   Manager extends Employee{
//     double salary=60000;
//     void displaySalary(){
//         System.out.println("manager salary"+salary);
//         System.out.println("employee slarry"+salary);
//     }
// }
// public class mainApp{
//     public static void main(String[] args){
//         Manager m=new Manager();
//         m.displaySalary();
        
//     }
// }


// # to access parent class data like var,methopd and constructor

// super keyword in inheritance why we use

// class Employee{
//     double salary=30000;
// }
// class   Manager extends Employee{
//     double salary=60000;
//     void displaySalary(){
//         System.out.println("manager salary"+salary);
//         System.out.println("employee slarry"+super.salary);
//     }
// }
// public class mainApp{
//     public static void main(String[] args){
//         Manager m=new Manager();
//         m.displaySalary();
        
//     }
// }
// #here we are accesing the method by using super keyword

// class Animal{
//     void eat(){
//         System.out.println("animal is eating");
//     }
// }
// class Dog extends Animal{
//     void eat(){
//         System.out.println("Dog is eating");
//         super.eat();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Dog d=new Dog();
//         d.eat();
//     }
// }

// ------------------------------------------
// class BankAccount{
//     String accountHolder;

//     BankAccount(String accountHolder){
//         this.accountHolder = accountHolder;


//     }
//     void displayDetails(){
//         System.out.println("Account Holder:"+ accountHolder);
//     }
    
// }

// class SavingAccount extends BankAccount{
//     double interestRate = 4.5;

//     SavingAccount(String accountHolder) {
//         super(accountHolder);
//     }

//     @Override
//     void displayDetails() {
//         super.displayDetails();
//         System.out.println("Interest rate:" + interestRate + "%");
//     }
// }



// -----------------------
// class Animal{
//     String name;
//     void eat(){
//         System.out.println("Animal is eating");

//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog is barking");
//     }
// }


// -----------------------------/

class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }
    void displayDetails(){
        System.out.println("employee name is "+name);
        System.out.println("employee salary is "+salary);      
    }
}
class Manager extends Employee{
    String dept;
    
    Manager( String name,double salary, String dept){
        super(name,salary);
        this.dept=dept;
    }
    @Override 
    void dispalyDetails() {
        super.displayDetails();
        System.out.println("dept is "+dept);
        System.out.println("Role:Manager");

    
    }

}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Anish", 50000, "IT");
        m.displayDetails();
    }
}