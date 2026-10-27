//12,13

// class Student {
//     String name;
//     int age;

//     void study() {
//         System.out.println(name + " is studying");
//     }

//     public static void main(String[] args) {
//         Student student = new Student();
//         student.name = "Alex";
//         student.age=22;
//         student.study();
//     }
// }



// ------------------------------------------------------------/


// class car{
//     String brand;
//     int speed;

//     void display(){
//         System.out.println(brand);
//         System.out.println(speed);
//     }

//     public static void main(String[] args) {
//         car c1=new car();
//         c1.brand="bmw";
//         c1.speed=120;
//         c1.display();
//     }
// }

// ------------------------------------------------------------
// by creating two classes 
// class Student {
//     String name;
//     int age;
     
//     void display(){
//         System.out.println("name is " +name+" and age is "+age);
//     }
//     public static void main(String[] args){
//         Student s1=new Student();
//         Student s2=new Student();

//         s1.name="pannu";
//         s1.age=22;

//         s2.name="amit";
//         s2.age=33;
//         s1.display();
//         s2.display();
//     }
// }


// --------------------------------------------------
// class car{
//     String brand;
//     int speed;
//     void drive(){
//         System.out.println(brand+"is driving at"+speed+"km/ph");
//     }
//     public static void main(String[] args) {
//         car c1=new car();
//         car c2=new car();
//         c1.brand="bmw";
//         c2.brand="maruti";
//         c1.speed=120;
//         c2.speed=60;
//         c1.drive();
//         c2.drive();
//     }
// }

// -----------------------------------------------------------


// class employee{
//     int id;
//     String name;
//     double salary;

//     void display(){
//         System.out.println("id" +id);
//         System.out.println("name is "+name);
//         System.out.println("salary is "+salary);
//     }
//     public static void main(String[] args) {
//         employee e1=new employee();
//         e1.id=101;
//         e1.name="srush";
//         e1.salary=23000;

//         e1.display();

//     }
// }



// ------------------------------------------------------------------


// class BankAccount{

//     String accountholder;
//     double balance;

//     void deposit(double amount){
//         balance=balance+amount;
//     }

//     void withdraw(double amount){
//         balance=balance-amount;
//     }
//     void displaybalance(){
//         System.out.println("balance"+balance);
//     }
//     public static void main(String[] args) {
//         BankAccount ba=new BankAccount();
//         ba.accountholder="srush";
//         ba.balance=233000;
//         ba.deposit(01000);
//         ba.withdraw(34444);
//         ba.displaybalance();
//     }
// }


// --------------------------------------------------------
// class mobile{
//     String brand;
//     int price;

//     void call(){
//         System.out.println(brand+"is calling");
//     }
//     void display(){
//         System.out.println(brand+" "+price);
//     }
//     public static void main(String[] args) {
//         mobile m1=new mobile();
//         m1.brand="samsung";
//         m1.price=25000;
//         m1.call();
//         m1.display();
//     }
// }

// -------------------------------------------------------------
// 8. Important: Object Can Have Data + Behavior
// This is the heart of OOP.
// class fan{
//      int speed;
//     void increaseSpeed(){
//         speed++;
        
//     }
//     void decreaseSpeed(){
//         speed--;
//     }
//     public static void main(String[] args) {
//         fan f1=new fan();
//         f1.increaseSpeed();
//         f1.decreaseSpeed();
//     }
// }


// --------------------------------------------------------------------
// 9. Very Important Example — Different Objects Have Different Data
// class Dog{
//     String name;
//     void bark(){
//         System.out.println(name+"says Woof");
//     }
//     public static void main(String[] args) {
//         Dog d1=new Dog();
//         Dog d2=new Dog();
//         d1.name="tommy";
//         d2.name="doggy";
//         d1.bark();
//         d2.bark();

//     }
// }

// --------------------------------------------
// 10. Real-World Example — Online Shopping
// class Product{
//     String name;
//     double price;
//     int quantity;

//     void display(){
//         System.out.println(name);
//         System.out.println(price);
//         System.out.println(quantity);
//     }
//     public static void main(String[] args) {
//         Product p1=new Product();
//         p1.name="laptop";
//         p1.price=23444;
//         p1.quantity=2;

//         Product p2=new Product();
//         p2.name="mobile";
//         p2.price=27800;
//         p2.quantity=1;
//         p1.display();
//         p2.display();
//     }
// }


// -----------------------------------------------------
// 11. Array of Objects 🔥

// class Student{
//     String name;
//     int marks;
//     void display(){
//         System.out.println(name+" "+marks);
//     }
//     public static void main(String[] args) {
//         Student[] student=new Student[3];    //Create an array that can hold 3 Student references.
//         student[0]=new Student();
//         student[1]=new Student();
//         student[2]=new Student();

//         student[0].name="pranavi";
//         student[0].marks=85;

//         student[1].name="harshal";
//         student[1].marks=90;

//         student[2].name="srushti";
//         student[2].marks=90;

//         for (Student s:student){
//             s.display();
//         }
//     }
// }


// -------------------------------------------------

// 12. Object as a Method Parameter
// class Student{
//     String name;
//     int marks;

// }
// class School{
//     void displayStudent(Student s){
//         System.out.println(s.name);
//         System.out.println(s.marks);
//     }
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="pranavi";
//         s1.marks=85;

//         School school=new School();
//         school.displayStudent(s1); // Pass s1 to the method
        
    
//     }
// }

// --------------------------------------------
// 13. Method Returning an Object

// import javax.sound.sampled.SourceDataLine;

// class Student{
//     String name;
//     int marks;

// }
// class StudentFactory{
//     Student createStudent(){
//         Student s=new Student();
//         s.name="pranavii";
//         s.marks=90;
//         return s;

//     }
//     public static void main(String[] args) {
//         StudentFactory factory = new StudentFactory();
//         Student s1 = factory.createStudent();
//         System.out.println(s1.name);
//         System.out.println(s1.marks);
//     }

// }


// ---------------------------------------------------
// 14. Object Reference — VERY IMPORTANT 🔥
// Look carefully:

// class Student{
//     String name;
//     int marks;
//     public static void main(String[] args) {
//         Student s1= new Student();
//         s1.name="pranavi";
//         Student s2=s1;
//         s2.name="rahul";
//         System.out.println(s1.name);
//     }
// }

// it gives output as rahul


// ------------------------------------------
// 15. new Creates a New Object

// class Student{
//     String name;
//     int marks;
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="a";
//         s1.marks=2;

//         Student s2=s1;
//         s2.name="a";
//         s2.marks=2;
        
//         System.out.println(s1.name);
//         System.out.println(s1.marks);
//         System.out.println(s2.name);
//         System.out.println(s2.marks);
        

//     }
// }


// ----------------------------------------------             

// practica
// 1easy
// class Student{
//     String name;
//     void display(){
//         System.out.println(name);
//     }
//     public static void main(String[] args) {
//         Student s=new Student();
//         s.name="pranavi";
//         s.display();
//     }
// }
// -----------------------------------

// 2 two objects

// class Car{
//     String brand;

//     public static void main(String[] args) {
//         Car c1=new Car();
//         Car c2=new Car();
//         c1.brand="bmw";
//         c2.brand="Audi";
//         System.out.println(c1.brand);
//         System.out.println(c2.brand);
//     }

// }


// ---------------------------------------
// 3 reference
// class Student{
//     String name;
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="pranavi";
//         Student s2= s1;
//         s2.name="rahul";
//         System.out.println(s1.name);
//         System.out.println(s2.name);
//     }
// }


// -----------------------------------------
// 4 array of objects
// class Student{
//     String name;
//     public static void main(String[] args) {
//         Student[] arr=new Student[2];
//         arr[0]=new Student();
//         arr[1]=new Student();

//         arr[0].name="A";
//         arr[1].name="B";

//         System.out.println(arr[0].name);
//         System.out.println(arr[1].name);
//     }
// }

// -----------------------------------------
// class Student{
//     String name;
//     public static void main(String[] args) {
//         Student[]arr=new Student[2];
//         arr[0].name="A";
//         arr[1].name="B";
//     }
// }


// -----------------------------------------------
// coding challenge
// class employee{
//     int id;
//     String name;
//     double salary;
//     String dept;

//     void display(){
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(salary);
//         System.out.println(dept);
//     }
//     public static void main(String[] args) {
//         employee e1= new employee();
//         e1.id=101;
//         e1.name="srush";
//         e1.salary=25000;
//         e1.dept="it";

//         employee e2=new employee();
//         e2.id=102;
//         e2.name="harshu";
//         e2.salary=25000;
//         e2.dept="analyst";

//         e1.display();
//         e2.display();
//     }
// }


// -------------------------------------------------

// Constructors in java


// -------------------------------------------------


// Now imagine we create  100 students. by doing this
// Student s1=new Student();
// s1.name="pranavi";
// s1.age=22;

// over and over is inconvinient
// we can use a constructor

// class Student{
//     String name;
//     int age;
//     Student(String name,int age){
//         this.name=name;
//         this.age=age;

//     }
//     void display(){
//         System.out.println(name+" "+age);
//     }
//     public static void main(String[] args) {
//         Student s1=new Student("pranavi", 22);
//         Student s2=new Student("srushti", 21);
//         s1.display();
//         s2.display();

//     }
// }


// ----------------------------------------------
// class Student{
//     Student(){
//         System.out.println("constructor called");
//     }
//     public static void main(String[] args) {
//         Student s=new Student();
//     }
// }


// ---------------------------------------------
// class Employee{
//     String name;

//     Employee(String name){
//         this.name=name;
//         System.out.println("employee created"+name);
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee("A");
//         Employee e2=new Employee("B");
//     }
// }



// --------------------------------------------------------------------
// practice
// to resolve which problem we use constructor
// so the pb is as below

// Employee e1=new Employee();
// e1.id=101;
// e1.name="srushti";
// e1.salary=25000;
// e1.dept="it";
// for n number of object we need to assign everything seperately like ABAOVE  
// to avoid that we use constructir


// Employee e1=new Employee(101,"srusht",25000,"it");
// according to above the constrcuctor let us initialize the object at the time of creation

// ------------------------------------------------
// 2. Your first constructor


// class Employee{
//     int id;
//     String name;
//     double salary;
//     String dept;

//     Employee(int id,String name,double salary,String dept){
//         this.id=id;
//         this.name=name;
//         this.salary=salary;
//         this.dept=dept;


//     }
//     void display(){
//         System.out.println("id: "+id);
//         System.out.println("Name: "+name);
//         System.out.println("salary: "+salary);
//         System.out.println("department: "+dept);
//     }
//     public static void main(String[] args){
//         Employee e1=new Employee(101,"srushti",25000,"it");
//         Employee e2=new Employee(102,"harshu",30000,"analyst");
//         e1.display();
//         e2.display();

//     }
// }


// ----------------------------------------------------
// 3. Constructor vs Method

// class Employee{
//     int id;
//     String name;
//     double salary;

//     //constructor
//     Employee(int id,String name,double salary){
//         this.id=id;
//         this.name=name;
//         this.salary=salary;
//         System.out.println("constructor called");
//     }
//     void display(){
//         System.out.println("id: "+id);
//         System.out.println("name: "+name);
//         System.out.println("salary:"+salary);
//     }
//     public static void main(String[] args) {
//         //Creating object
//         Employee e1=new Employee(101,"pranavi",25000);
//         //calling method
//         e1.display();

//     }
// }

// ----------------------------------------------
// it will give compilation error

// class Student{
//     String name;
//     Student(String name){
//         this.name=name;

//     }

// }
// public class Main{
//     public static void main(String[] args) {
//         Student s=new Student();
//         System.out.println(s.name);

//     }
// }    
// ----------------------------------------------
// default constructor
// String → null
// int    → 0
// double → 0.0
// boolean → false

// class Student{
//     String name;
//     int age;

// }
// class Main{
//     public static void main(String[] args) {
//         Student s= new Student();
//         System.out.println(s.name);
//         System.out.println(s.age);
//     }
// }

//  ---------------------------------------
// Case 2 — You write a constructor

// class Student{
//     String name;
//     Student(String name){
//         this.name=name;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Student s=new Student("pannu");
//         System.out.println(s.name);
        
//     }
// }

// -------------------------------------------
// Practice Example 1
// class car{
//     String brand;
//     int speed;

// }
// class Main{
//     public static void main(String[] args) {
//         car c=new car();
//         System.out.println(c.brand);
//         System.out.println(c.speed);
//     }
// }

// ---------------------------------------
// 🧪 Practice Example 2
// class car{
//     String brand;
//     car(String brand){
//         this.brand=brand;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         car c= new car("bmw");
//         System.out.println(c.brand);
//     }
// }


// ---------------------------------------------
// no argument constructor
// class Student{
//     String name;
//     Student(){
//         name="Unknown";

//     }
//     Student(String name){
//         this.name=name;

//     }
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student("pranavi");
//         System.out.println(s1.name);
//         System.out.println(s2.name);
//     }
// }
// --------------------------------------------------
// parametrized constructor
// class Mobile{
//     String brand;
//     double price;
//     Mobile(String brand,double price){
//         this.brand=brand;
//         this.price=price;
//     }
//     public static void main(String[] args) {
//         Mobile m1=new Mobile("samsung",25000);
//         Mobile m2=new Mobile("iphone",70000);
//     }
// }


// ------------------------------------------------
// 7. Multiple Constructors — Constructor Overloading

// class Student{
//     String name;
//     int age;

//     Student(){
//         name="unknown";
//         age=0;

//     }
//     Student(String name){
//         this.name=name;
//         age=0;
//     }
//     Student(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student("pranavi");
//         Student s3=new Student("pranavi",22);
//     }
// }

// Method overloading:
// same method name
// different parameters

// Constructor overloading:
// same constructor name
// different parameters
// Student()
// Student(String)
// Student(String,int)


// PART 8 — Constructor + this
// Example 1: Basic this

// class Employee{
//     int id;
//     String name;

//     Employee(int id,String name){
//         this.id=id;
//         this.name=name;
//     }
//     void display(){
//         System.out.println("id: "+id);
//         System.out.println("name: "+name);
//     }
//     public static void main(String[] args){
//         Employee e1=new Employee(101,"pranavi");
//         e1.display();
//     }
// }

// -----------------------------------------------------
// PART 9 — Why id = id is wrong
// class Employee{
//     int id;
//     Employee(int id){
//         id=id;

//     }
//     void display(){
//         System.out.println(id);
//     }

//     public static void main(String[] args) {
//         Employee e= new Employee(101);
//         e.display();
//     }
// }

// Output
// 0

// Why?

// Because:
// id = id;

// is effectively:
// parameter id = parameter id

// The instance variable remains at its default value:
// int → 0

// --------------------------------------------------------
// Correct version
// class Employee{
//     int id;
//     Employee(int id){
//         this.id=id;
//     }
//     void display(){
//         System.out.println(id);
//     }
//     public static void main(String[] args) {
//         Employee e= new Employee(101);
//         e.display();
//     }
// }
// -----------------------------------------------------------
// PART 10 — Constructor Calling Another Constructor
// Now we introduce:
// this()


// Don't confuse:
// this.id

// with:
// this()

// They are different.
// this.id
// Refers to current object's variable.
// this()
// Calls another constructor of the same class.


// class Student{
//     String name;
//     int age;

//     Student(){
//         this("unknown",0);
//     }
//     Student(String name){
//         this(name,18);

//     }
//     Student(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     void display(){
//         System.out.println("name"+name);
//         System.out.println("age"+age);
//     }
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student("pranavi");
//         Student s3=new Student("Rahul",23);
//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }


// How this() works
// For:
// Student s1 = new Student();

// Java calls:
// Student()

// Inside:
// this("Unknown", 0);

// So it calls:
// Student(String name, int age)

// For:
// Student s2 = new Student("Pranavi");

// Java calls:
// Student(String name)

// Inside:
// this(name, 18);

// which calls:
// Student(String name, int age)

// this() must be the first statement.
// Correct:
// Student() {

//     this("Unknown", 0);
// }

// ❌ Wrong:
// Student() {

//     System.out.println("Hello");

//     this("Unknown", 0);
// }

// This gives a compilation error.

// constructor chain
// predict the output
// class Test{
//     Test(){
//         this(10);
//         System.out.println("A");
//     }
//     Test(int x){
//         System.out.println("B");
//     }
//     public static void main(String[] args){
//         Test t= new Test();
//     }
// }
// What prints?

// Think carefully about which constructor executes first.


// PART 11 — Bank Account Constructor
// class BankAccount{
//     String accountHolder;
//     double balance;
//     BankAccount(String accountHolder,double balance){
//         this.accountHolder=accountHolder;
//         this.balance=balance;
//     }
//     void display(){
//         System.out.println("Account Holder"+accountHolder);
//         System.out.println("balance"+balance);
//     }
//     public static void main(String[] args) {
//         BankAccount a1=new BankAccount("pranavi", 50000);
//         BankAccount a2=new BankAccount("rahul", 10000);
//         a1.display();
//         a2.display();
//     }
// }


// --------------------------------------------------------
// PART 12 — Product Constructor
// class Product{
//     int id;
//     String name;
//     double price;

//     Product(int id, String name,double price){
//         this.id=id;
//         this.name=name;
//         this.price=price;
//     }
//     void display(){
//         System.out.println("id: "+id);
//         System.out.println("name: "+name);
//         System.out.println("price: "+price);
//     }
//     public static void main(String[] args) {
//         Product p1=new Product(1,"laptop",50000);
//         Product p2=new Product(2, "Mobile", 25000);
//         Product p3=new Product(3,"mouce",800);

//         p1.display();
//         p2.display();
//         p3.display();
//     }
// }



// ----------------------------------------------------------
// PART 13 — Constructor Validation/
// class Employee{
//     int id;
//     String name;
//     double salary;

//     Employee(int id,String name,double salary){
//         this.id=id;
//         this.name=name;

//         if(salary>=0){
//             this.salary=salary;

//         }
//         else{
//             this.salary=0;
//         }


//     }
//     void display(){
//         System.out.println("id: "+id);
//         System.out.println("name: "+name);
//         System.out.println("salary: "+salary);
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee(`101,"pranavi",25000);
//         Employee e2=new Employee(102,"Rahul",-5000);
//         e1.display();
//         e2.display();
//     }
// }


// PART 14 — What happens if there is no no-argument constructor?

