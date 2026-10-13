
// class Address {
//     String city;
//     String state;
//     int pincode;

//     Address(String city, String state, int pincode) {
//         this.city = city;
//         this.state = state;
//         this.pincode = pincode;
//     }

//     void displayAddress() {
//         System.out.println(city + ", " + state + ", " + pincode);
//     }
// }

// class Student {
//     String name;
//     int rollno;
//     Address address;

//     Student(String name, int rollno, Address address) {
//         this.name = name;
//         this.rollno = rollno;
//         this.address = address;
//     }

//     void displayProfile() {
//         System.out.println("Student: " + name + "\nRoll No.: " + rollno);
//         System.out.println("Lives at:");
//         address.displayAddress();
//     }
class Address {
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress() {
        System.out.println(city + ", " + state + ", " + pincode);
    }
}

class Student {
    String name;
    int rollno;
    Address address;

    Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Student: " + name);
        System.out.println("Roll No.: " + rollno);
        System.out.println("Lives at:");
        address.displayAddress();
    }
}
}
