package org.example.arge;
import org.example.arge.HybridCar;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Hybrid system starting: battery + " + cylinders + "-cylinder engine");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Efficiency: " + avgKmPerLitre + " km/l, Battery: " + batterySize + " kWh");
    }
}
