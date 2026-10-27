// package Java-programmming--main.oop;


/* 
public class Main {
    public static void main(String[] args) {
        
    // store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names=new String[5];

    //data of 5 students:{roll no,name,marks}
    int[] rno= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];

    Student[] students=new Student[5];   //here i create student datatype or my own datatype
        // create one student here
    Student kunal;   //it consist of 3 properties rno,name,marks
}

    // class is a named group of properties and functions ---these three properties that are above if i want to combine into one entity then i use class
    //create a class
    class Student{
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];
    }   
}


*/

// more details
// car can be a class----using that temoleate so many company craeate cars
// but the value of that property is different...like every car having different engines


// when your creating object of thaat class means instance pf that class
// class is a logical construct and object isa physical reality
// object occupies the space in memory...
// objects are store in heap memory and the reference variable is stored in stack memory
// how we access data or properties ...by using . operator

// instance var----the variables present inside the object and outside the methos

//  

//how to use . operator

// sout(student1.rno)

/* 

public class Main {
    public static void main(String[] args) {
        
    // store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names=new String[5];

    //data of 5 students:{roll no,name,marks}
    int[] rno= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];

    Student[] students=new Student[5];   //here i create student datatype or my own datatype
        // create one student here
    // Student kunal;   //it consist of 3 properties rno,name,marks   declare the reference to the obj
    System.out.println(kunal.rno); 
}
// for every single student
class Student{
    int rno;
    String name;
    float marks;

}

*/



/* lets try to print it
public class Main {
    public static void main(String[] args) {
        
    // store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names=new String[5];

    //data of 5 students:{roll no,name,marks}
    int[] rno= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];

    Student[] students=new Student[5];   //here i create student datatype or my own datatype
        // create one student here
    Student kunal;   //it consist of 3 properties rno,name,marks   declare the reference to the obj

    System.out.println(Arrays.toString(students)); 
}
// for every single student
class Student{
    int rno;
    String name;
    float marks;

}

*/

// Student student1;
// student1=new Student();
// dynamicaally allocates the memory  and return refernce to it
// and this reference is stored in stored instudent 1 var

// dynamic memory allocation
// static memory allocation


// public class Main {
//     public static void main(String[] args) {
        
//     // store 5 roll nos
//     int[] numbers=new int[5];
//     //store 5 names
//     String[] names=new String[5];

//     //data of 5 students:{roll no,name,marks}
//     int[] rno= new int[5];
//     String[] name=new String[5];
//     float[] marks=new float[5];

//     Student[] students=new Student[5];   //here i create student datatype or my own datatype
//         // create one student here
//     Student kunal;   //it consist of 3 properties rno,name,marks   declare the reference to the obj

//     kunal=new Student();
// // accessing reference var by rno
//     kunal.rno=13;
//     kunal.name="kunal khushvaha";
//     kunal.marks=88.5f;

//     // print default values
//     System.out.println(kunal);
//     System.out.println(kunal.rno);
//     System.out.println(kunal.name);  //value is null bcoz String  is class
//     System.out.println(kunal.marks);
// }
// }
// // for every single student
// class Student{
//     int rno;
//     String name;   
//     float marks= 90;    // lets say some default valye here

// }



// kunal can write in bleow line which declare below 
// kunal kunal=new Student();
// accessing reference var by rno
    // kunal.rno=13;
    // kunal.name="kunal khushvaha";
    // kunal.marks=88.5f;


    // then constructor concept is comes into picture

    /* 
public class Main {
    public static void main(String[] args) {
        
    // store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names=new String[5];

    //data of 5 students:{roll no,name,marks}
    int[] rno= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];

    Student[] students=new Student[5];   //here i create student datatype or my own datatype
        // create one student here
    Student kunal = new Student(13, "kunal", 84.3f);
      
    System.out.println(kunal);
    System.out.println(kunal.rno);
    System.out.println(kunal.name);  //value is null bcoz String  is class
    System.out.println(kunal.marks);
}
}
// for every single student
class Student{
    int rno;
    String name;   
    float marks= 90;    // lets say some default valye here
    // charonstructor is special function  that runs when you create an object and   it allocate some variable // print default values
//    we need a way to add the values of the above
//    properties object by object
// we need one word to access every object

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        this.rno=13;
        this.name="aaaaa";
        this.marks=88.5f;

    }

}

*/

// constructor is a special  function that runs when you create an objetc and it allocates some variable
// during calling the function you have to give arguments
// and bind this arguemmnets with object
/* 

class Student{
    int rno;
    String name;
    float marks=90;
    // we need a way to add the values of the above properties object by object
    // we need one word to access every object
    void greeting(){
    System.out.println("my name is"=this.name);
    }
    Student(){    //constructor
        this.rno=13;                    //this is a reference variable
        this.name="kunal khushvaha";
        this.marks=88.5f;

    }
}
    */



//after greeting i create another methos

public class Main {
    public static void main(String[] args) {
        
    // store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names=new String[5];

    //data of 5 students:{roll no,name,marks}
    int[] rno= new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];

    Student[] students=new Student[5];   //here i create student datatype or my own datatype
        // create one student here
    Student kunal = new Student(13, "kunal", 84.3f);
      
    kunal.changeName("rahul");
    kunal.greeting();
    // System.out.println(kunal);
    // System.out.println(kunal.rno);
    // System.out.println(kunal.name);  //value is null bcoz String  is class
    // System.out.println(kunal.marks);

}
}
// for every single student
class Student{
    int rno;
    String name;   
    float marks= 90;    // lets say some default valye here
    // charonstructor is special function  that runs when you create an object and   it allocate some variable // print default values
//    we need a way to add the values of the above
//    properties object by object
// we need one word to access every object
    
    void greeting(){
        System.out.println("hello! my name is "+this.name);
    }
    void changeName(String newName){
        this.name=newName;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student() {      //when you call without values then it take this values otherwise it will take below one para
        this.rno=13;
        this.name="aaaaa";
        this.marks=88.5f;

    }
}


