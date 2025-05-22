package org.example.arge;
import org.example.arge.GasPoweredCar;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Gas engine starting with " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Fuel efficiency: " + avgKmPerLitre + " km/l");
    }
}