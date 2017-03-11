package ru.ilka.taxi.vehicle;

import ru.ilka.taxi.vehicle.type.*;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Car extends Vehicle {
    private int passengers;
    private double timeToHundred;
    private CarBodyType bodyType;
    private LuggageSize luggageSize;

    public Car(int doors, int passengers, double timeToHundred, CarBodyType bodyType, LuggageSize luggageSize) {
        this.passengers = passengers;
        this.timeToHundred = timeToHundred;
        this.bodyType = bodyType;
        this.luggageSize = luggageSize;
    }

    public Car(String make, String model,VehicleType vehicleType, int cost, int power, int doors, GearBoxType gearBox, FuelType fuel, long id, int passengers, double timeToHundred, CarBodyType bodyType, LuggageSize luggageRackSize) {
        super(make, model,vehicleType, cost,  power, doors, gearBox, fuel, id);
        this.passengers = passengers;
        this.timeToHundred = timeToHundred;
        this.bodyType = bodyType;
        this.luggageSize = luggageRackSize;
    }

    public Car(Vehicle vehicle, int passengers, double timeToHundred, CarBodyType bodyType, LuggageSize luggageRackSize) {
        super(vehicle);
        this.passengers = passengers;
        this.timeToHundred = timeToHundred;
        this.bodyType = bodyType;
        this.luggageSize = luggageRackSize;
    }

    public  Car(Car car){
        super(car);
        this.passengers = car.getPassengers();
        this.bodyType = car.getBodyType();
        this.luggageSize = car.getLuggageSize();
        this.timeToHundred = car.getTimeToHundred();
    }

    public Car(){

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getTimeToHundred() {
        return timeToHundred;
    }

    public void setTimeToHundred(double timeToHundred) {
        this.timeToHundred = timeToHundred;
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarBodyType bodyType) {
        this.bodyType = bodyType;
    }

    public LuggageSize getLuggageSize() {
        return luggageSize;
    }

    public void setLuggageSize(LuggageSize luggageRackSize) {
        this.luggageSize = luggageRackSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null || o.getClass() != getClass()){
            return false;
        }

        Car car = (Car) o;

        if (passengers != car.passengers) return false;
        if (Double.compare(car.timeToHundred, timeToHundred) != 0) return false;
        if (bodyType != car.bodyType) return false;
        return luggageSize == car.luggageSize;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + passengers;
        temp = Double.doubleToLongBits(timeToHundred);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + bodyType.hashCode();
        result = 31 * result + luggageSize.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", passengers=" + passengers +
                ", timeToHundred=" + timeToHundred +
                ", bodyType=" + bodyType +
                ", luggageSize=" + luggageSize +
                '}';
    }
}
