package org.example.arge;
import org.example.arge.ElectricCar;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Electric motor powering up with battery size " + batterySize);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Range per charge: " + avgKmPerCharge + " km");
    }
}