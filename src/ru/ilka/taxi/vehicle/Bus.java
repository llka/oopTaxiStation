package ru.ilka.taxi.vehicle;

import ru.ilka.taxi.vehicle.type.BusBodyType;
import ru.ilka.taxi.vehicle.type.FuelType;
import ru.ilka.taxi.vehicle.type.GearBoxType;
import ru.ilka.taxi.vehicle.type.VehicleType;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Bus extends Vehicle {
    private BusBodyType bodyType;
    private int seats;

    public Bus(BusBodyType bodyType, int seats) {
        this.bodyType = bodyType;
        this.seats = seats;
    }

    public Bus(String make, String model, VehicleType vehicleType, int cost, int power, int doors, GearBoxType gearBox, FuelType fuel, long id, BusBodyType bodyType, int seats) {
        super(make, model, vehicleType, cost, power, doors, gearBox, fuel, id);
        this.bodyType = bodyType;
        this.seats = seats;
    }

    public Bus(Vehicle vehicle, BusBodyType bodyType, int seats) {
        super(vehicle);
        this.bodyType = bodyType;
        this.seats = seats;
    }

    public Bus(Bus bus){
        super(bus);
        this.bodyType = bus.getBodyType();
        this.seats = bus.getSeats();
    }

    public Bus(){

    }

    public BusBodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BusBodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bus bus = (Bus) o;

        if (seats != bus.seats) return false;
        return bodyType == bus.bodyType;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bodyType != null ? bodyType.hashCode() : 0);
        result = 31 * result + seats;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bodyType=" + bodyType +
                ", seats=" + seats +
                '}';
    }
}
