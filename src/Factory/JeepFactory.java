package Factory;
import Cars.Cars;
import Cars.Jeep;
public class JeepFactory implements CarFactory {
    @Override
    public Cars createCar() {
        return new Jeep();
    }
}
