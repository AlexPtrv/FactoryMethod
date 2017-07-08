import Cars.Cars;
import Factory.AudiFactory;
import Factory.CarFactory;
import Factory.ChevroletFactory;
import Factory.JeepFactory;

public class ShowCars {
    public static void main(String[] args) {
        CarFactory carFactory= showCarsByMark("Chevrolet");
        Cars cars=carFactory.createCar();
        cars.showCars();

    }
    private static CarFactory showCarsByMark(String car){
        if (car.equals("Jeep")){
            return new JeepFactory();
        }
        else if (car.equals("Audi")){
            return new AudiFactory();
        }
        else if (car.equals("Chevrolet")){
            return new ChevroletFactory();
        }
throw new RuntimeException(car+" нету.");
    }
}
