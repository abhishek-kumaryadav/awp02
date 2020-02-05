package data_models;

public class SUV extends Car {

    public SUV(String make, String model, String numberplate) {
        super(6, make, model, numberplate);
    }

    @Override
    float getPrice(float km) {
        return km * 20 + 15;
    }

}
