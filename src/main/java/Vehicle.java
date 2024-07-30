public class Vehicle {
    private String vehicleType;
    private String licenseNumber;
    private int rentalRatePerDay;

    public Vehicle(String vehicleType, String licenseNumber, int rentalRatePerDay) {
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public int calculateRentalCost(int days) {
        return rentalRatePerDay * days;
    }
}

class Car extends Vehicle {
    int numSeats;

    public Car(String vehicleType, String licenseNumber, int rentalRatePerDay, int numSeats) {
        super(vehicleType, licenseNumber, rentalRatePerDay);
        this.numSeats = numSeats;
    }
}

class Bike extends Vehicle {
    String bikeType;

    public Bike(String licenseNumber, int rentalRatePerDay, String bikeType) {
        super(bikeType, licenseNumber, rentalRatePerDay);
        this.bikeType = bikeType;
    }
}

class Truck extends Vehicle {
    String truckType;
    int loadCapacity;

    public Truck(String licenseNumber, int rentalRatePerDay, String truckType, int loadCapacity) {
        super(truckType, licenseNumber, rentalRatePerDay);
        this.truckType = truckType;
        this.loadCapacity = loadCapacity;
    }

    public static class VehicleRentalSystem {
        public static void main(String[] args) {
            Vehicle[] vehicles = {
                    new Car("Toyota Camry", "WR 234 24", 100, 4),
                    new Bike("WR B34", 200, "Mountain bike"),
                    new Truck("WR 24T 24", 500, "Man Diesel", 1)
            };
            int rentalDays = 3;
            for (Vehicle vehicle : vehicles) {
                int cost = vehicle.calculateRentalCost(rentalDays);

                System.out.println(vehicle.getVehicleType() + " (License: " + vehicle.getLicenseNumber() + "): Ghs" + cost + " for " + rentalDays + " days, Rate: Ghs" + vehicle.getRentalRatePerDay());

            }
        }
    }
}




