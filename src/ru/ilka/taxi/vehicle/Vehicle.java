package ru.ilka.taxi.vehicle;

import ru.ilka.taxi.vehicle.type.FuelType;
import ru.ilka.taxi.vehicle.type.GearBoxType;
import ru.ilka.taxi.vehicle.type.VehicleType;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Vehicle {
    private String make;
    private String model;
    private VehicleType vehicleType;
    private int cost;
    private int power;
    private int doors;
    private GearBoxType gearBox;
    private FuelType fuel;
    private long vehicleId;

    public Vehicle(){

    }

    public Vehicle(String make, String model, VehicleType vehicleType, int cost, int power, int doors,GearBoxType gearBox, FuelType fuel, long vehicleId) {
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.cost = cost;
        this.power = power;
        this.doors = doors;
        this.gearBox = gearBox;
        this.fuel = fuel;
        this.vehicleId = vehicleId;
    }

    public Vehicle(Vehicle vehicle){
        this.make = vehicle.getMake();
        this.model = vehicle.getModel();
        this.cost = vehicle.getCost();
        this.doors = vehicle.getDoors();
        this.power = vehicle.getPower();
        this.gearBox = vehicle.getGearBox();
        this.fuel = vehicle.getFuel();
        this.vehicleId = vehicle.getId();
    }

    public long getId(){
        return vehicleId;
    }

    public void setId(long id) {
        this.vehicleId = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public GearBoxType getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBoxType gearBox) {
        this.gearBox = gearBox;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vehicle vehicle = (Vehicle) o;

        if (cost != vehicle.cost) return false;
        if (power != vehicle.power) return false;
        if (doors != vehicle.doors) return false;
        if (!make.equals(vehicle.make)) return false;
        if (!model.equals(vehicle.model)) return false;
        if (gearBox != vehicle.gearBox) return false;
        return fuel == vehicle.fuel;

    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + cost;
        result = 31 * result + power;
        result = 31 * result + gearBox.hashCode();
        result = 31 * result + fuel.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Id='" + vehicleId + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", power=" + power +
                ",doors= " + doors +
                ", gearBox=" + gearBox +
                ", fuel=" + fuel +
                '}';
    }
}
