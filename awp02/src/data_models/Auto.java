package data_models;

public class Auto extends Car {

    public Auto(String make, String model, String numberplate) {
        super(3, make, model, numberplate);
    }

    @Override
    float getPrice(float km) {
        return 10 * km + 5;
    }
}
