
class Battery {
    int capacityMaH;

    Battery(int capacityMaH) {
        this.capacityMaH = capacityMaH;
    }

    void drain() {
        System.out.println("Battery used.");
        System.out.println("Capacity remaining: "
                + (capacityMaH - 100) + " mAh");
    }
}

class Camera {
    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("Click... captured a photo with "
                + pix + " megapixels.");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapCamera() {
        System.out.println("[" + brand + "] is active.");
        camera.takePhoto();
        battery.drain();
    }

    
}