package org.example.arge;
import org.example.arge.CarSkeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Generic Car";
        this.description = "A basic car skeleton";
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Starting engine...");
    }

    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> Driving...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> Engine is running...");
    }
}