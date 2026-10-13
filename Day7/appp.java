
public class appp {
    public static void main(String[] args) {
        Address a = new Address("Mumbai", "Maharashtra", 422201);

        Student s = new Student("Varun", 101, a);

        s.displayProfile();
    }
}
