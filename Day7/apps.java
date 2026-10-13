public class apps {
    public static void main(String[] args) {
        Battery b = new Battery(5000);
        Camera c = new Camera(48);

        Phone p = new Phone("Samsung", b, c);

        p.snapCamera();
    }
}