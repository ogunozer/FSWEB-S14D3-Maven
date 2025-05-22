package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine()   { return getClass().getSimpleName() + " -> Holden engine starting"; }
    @Override
    public String accelerate()    { return getClass().getSimpleName() + " -> Holden accelerating"; }
    @Override
    public String brake()         { return getClass().getSimpleName() + " -> Holden braking"; }
}
