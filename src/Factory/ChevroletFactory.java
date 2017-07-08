package Factory;

import Cars.Cars;
import Cars.Chevrolet;


/**
 * Created by Alex on 08.07.2017.
 */
public class ChevroletFactory implements CarFactory {
    @Override
    public Cars createCar() {
        return new Chevrolet();
    }
}
