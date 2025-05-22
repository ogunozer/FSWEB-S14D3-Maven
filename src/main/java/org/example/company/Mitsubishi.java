package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine()   { return getClass().getSimpleName() + " -> engine roaring!"; }
    @Override
    public String accelerate()    { return getClass().getSimpleName() + " -> zoom zoom!"; }
    @Override
    public String brake()         { return getClass().getSimpleName() + " -> smooth stop!"; }
}
