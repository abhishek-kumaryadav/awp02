package data_models;

public class Sedan extends Car {

    public Sedan(String make, String model, String numberplate) {
        super(4, make, model, numberplate);
    }

    @Override
    float getPrice(float km) {
        return 15 * km + 12;
    }
}
