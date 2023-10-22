package builder.domain;

import builder.domain.car.*;

public class BuilderService {
    public void exec() {
        Car car1 = new Car.Builder()
                .setCarType(CarType.CITY_CAR)
                .setEngine(new Engine(2.0, 0))
                .setSeats(4)
                .setGpsNavigator(new GpsNavigator("address 1 to address 2"))
                .build();
        System.out.println(car1);

        Car car2 = new Car.Builder()
                .setCarType(CarType.SPORTS_CAR)
                .setEngine(new Engine(4.0, 0))
                .setSeats(2)
                .setTripComputer(new TripComputer())
                .setTransmission(Transmission.SINGLE_SPEED)
                .build();
        car2.getTripComputer().setCar(car2);
        car2.getTripComputer().showStatus();
    }
}
