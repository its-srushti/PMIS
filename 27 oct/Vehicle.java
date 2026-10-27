public abstract class Vehicle implements Rentable {
    private String id, model;
    private double dailyRate;
    private boolean available = true;

    public Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getId() { return id; }
    public String getModel() { return model; }
    public double getDailyRate() { return dailyRate; }

    @Override
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " "
                + model + " (" + id + ")";
    }

    public abstract double calculateRent(int days);
}