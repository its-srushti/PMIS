import java.util.ArrayList;
import java.util.List;

public class RentalShop {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Days must be greater than zero");
        }

        Vehicle selected = null;

        for (Vehicle v : fleet) {
            if (v.getId().equalsIgnoreCase(vehicleId)) {
                selected = v;
                break;
            }
        }

        if (selected == null) {
            throw new IllegalArgumentException(
                    "Vehicle " + vehicleId + " not found");
        }

        if (!selected.isAvailable()) {
            throw new IllegalStateException(
                    selected + " is already rented");
        }

        Rental rental = new Rental(selected, customer, days);
        selected.setAvailable(false);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(String vehicleId) {
        for (Vehicle v : fleet) {
            if (v.getId().equalsIgnoreCase(vehicleId)) {
                if (v.isAvailable()) {
                    throw new IllegalStateException(
                            v + " is not currently rented");
                }
                v.setAvailable(true);
                return;
            }
        }

        throw new IllegalArgumentException(
                "Vehicle " + vehicleId + " not found");
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");
        for (Vehicle v : fleet) {
            if (v.isAvailable()) {
                System.out.println("  " + v);
            }
        }
    }
}