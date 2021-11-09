package povtor.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestThree {
    public static ArrayList<CarTT> createThreeCars(Supplier<CarTT> carTTSupplier) {
        ArrayList<CarTT> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carTTSupplier.get());
        }
        return al;
    }

    public static void changeCar(CarTT car, Consumer<CarTT> carTTConsumer) {
        carTTConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<CarTT> ourCars = createThreeCars(() ->
                new CarTT("BMW", "black", 2.2));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0)
                , carTT -> {
                    carTT.color = "violet";
                    carTT.engine = 2.6;
                    System.out.println("Upgraded car: " + carTT);
                });

        System.out.println("Our cars: " + ourCars);
    }
}

class CarTT {
    String model;
    String color;
    double engine;

    public CarTT(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarTT{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
