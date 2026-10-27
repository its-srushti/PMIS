public class Main {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        shop.addVehicle(new Car("C1", "Swift", 1500));
        shop.addVehicle(new Bike("B1", "Activa", 400));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        Rental r1 = shop.rent("B1", asha, 8);
        System.out.printf("%s rented %s for %d days = %.2f%n",
                r1.getCustomer().getName(), r1.getVehicle(),
                r1.getDays(), r1.getTotalRent());

        Rental r2 = shop.rent("T1", ravi, 2);
        System.out.printf("%s rented %s for %d days = %.2f%n",
                r2.getCustomer().getName(), r2.getVehicle(),
                r2.getDays(), r2.getTotalRent());

        try {
            shop.rent("B1", ravi, 3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.giveBack("B1");
        shop.showAvailable();
    }
}