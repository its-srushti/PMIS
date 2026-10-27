// import javax.swing.Box;
/* 
class Box<T>{
    private T item;
    void set(T item){
        this.item=item;
    }
    T get(){
        return item;
    }
}
class gen{
    public static void main(String[] args) {
        // Box box=new Box();
        // box.set("bhumi");
        // String s=(String) box.get();
        // box.set(43);
        // int t=(int) box.get();
        Box<String> box = new Box<>();
        box.set("hello");
        String s=box.get();
        System.out.println(s);
    }
}

*/
// compile time errors detetcted without generics we cANT DETECT COMPILE TIME ERRORS,,THE CODE WILL BREAK WHILE EXECUTING(RUM TIME)

// no manual casting
// reusable code

// rules:
// 1 mention the wrapper class
// 2 java automatically performs autoboxing and unboxing

// multi type parameters
// with generics

/* 
class Pair<K,V>{
    private K key;
    private V value;
    Pair(K key , V value){
        this.key=key;
        this.value=value;

    }
    K getKey(){
        return key;
    }
    V getValue(){
        return value;
    }
}

class gen{
    public static void main(String[] args){
        Pair<String,Integer> p=new Pair<>("Age",25);
        String k=p.getKey();
        Integer v=p.getValue();
        System.out.println(k +":"+v);
    }
}

*/

//without generics



// class Pair{
//     private Object key;
//     private Object value;

//     Pair(Object key,Object value){
//         this.key=key;
//         this.value=value;

//     }
//     Object getKey(){
//         return key;
//     };
//     Object getVlaue(){
//         return value;
//     }

// }

// class gen{
//     public static void main(String[] args){
//         Pair p=new Pair("age",25);

//         String K=(String) p.getKey();
//         Integer V=(Integer) p.getValue();
//         System.out.println(K+":"+V);

//     }
// }


/* 
class Util{
    static<T> void printTwice(T value){
        System.out.println(value);
        System.out.println(value);
    }
    static <T> T firstof(T a,T b){
        return b;
    }
}

class gen{
    public static void main(String [] args){
        Util.printTwice(100);
        System.out.println(Util.firstof("Hi","Hello"));

    }
}
*/


// once done with the quiz, solve the below question:

// Problem statement
// Create a generic class Box<T> that can store one item of any reference type.
// Requirements:
// 1. Create a class Box<T> with a private variable item.
// 2. Create a setItem(T item) method to store the item.
// 3. Create a getItem() method to return the item.
// 4. Test the class using String and Integer.
// Expected output
// Mobile: Samsung
// Price: 25000



// c


