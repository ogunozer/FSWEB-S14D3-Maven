package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine()   { return getClass().getSimpleName() + " -> starting Ford engine"; }
    @Override
    public String accelerate()    { return getClass().getSimpleName() + " -> Ford accelerating"; }
    @Override
    public String brake()         { return getClass().getSimpleName() + " -> Ford brakes applied"; }
}
