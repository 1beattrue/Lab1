package builder.domain.car;

public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;
    private double fuel = 0;

    private Car() {
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }

    public static Builder newBuilder() {
        return new Car().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setCarType(CarType type) {
            Car.this.carType = type;
            return this;
        }

        public Builder setSeats(int seats) {
            Car.this.seats = seats;
            return this;
        }

        public Builder setEngine(Engine engine) {
            Car.this.engine = engine;
            return this;
        }

        public Builder setTransmission(Transmission transmission) {
            Car.this.transmission = transmission;
            return this;
        }

        public Builder setTripComputer(TripComputer tripComputer) {
            Car.this.tripComputer = tripComputer;
            return this;
        }

        public Builder setGpsNavigator(GpsNavigator gpsNavigator) {
            Car.this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Car build() {
            return Car.this;
        }
    }
}
