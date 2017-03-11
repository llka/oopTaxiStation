package ru.ilka.taxi.station;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;


/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Station {
    private List<Vehicle> vehicles;

    public Station(){
        vehicles = new ArrayList<>();
    }

    public boolean addVechicle(Vehicle vehicle){
        return vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int size() {
        return this.vehicles.size();
    }

    public void removeAllVehicles() {
        this.vehicles.clear();
    }

}
