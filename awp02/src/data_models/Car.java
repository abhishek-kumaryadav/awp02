package data_models;

public abstract class Car {
    int capacity;
    String make;
    String model;
    String numberplate;
    abstract float getPrice(float km);

    public Car(int capacity, String make, String model, String numberplate) {
        this.capacity = capacity;
        this.make = make;
        this.model = model;
        this.numberplate = numberplate;
    }
}
