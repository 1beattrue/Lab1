package builder.domain;

import builder.domain.car.*;

public class BuilderService {
    public void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GpsNavigator());
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
    }
}
