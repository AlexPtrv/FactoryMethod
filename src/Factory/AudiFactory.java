package Factory;

import Cars.Audi;
import Cars.Cars;


/**
 * Created by Alex on 08.07.2017.
 */
public class AudiFactory implements CarFactory {
    @Override
    public Cars createCar() {
        return new Audi();
    }
}
