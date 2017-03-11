package ru.ilka.taxi.station.action;

import ru.ilka.taxi.exception.NoSuchVehicleException;
import ru.ilka.taxi.station.Station;
import ru.ilka.taxi.vehicle.Car;
import ru.ilka.taxi.vehicle.Truck;
import ru.ilka.taxi.vehicle.Vehicle;
import ru.ilka.taxi.vehicle.type.VehicleType;

import java.util.*;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class VehicleFinder {

    public List<Car> findVehicleByPassengers(Station station, int passengers) throws NoSuchVehicleException {
        List<Vehicle> vehicles = station.getVehicles();
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i).getVehicleType() == VehicleType.CAR)
            {
                Car car = (Car) vehicles.get(i);
                if(car.getPassengers() >= passengers) {
                    cars.add(car);
                }
            }
        }

        Sorter sorter = new Sorter();

        sorter.sortByPassengers(cars);

        return Collections.unmodifiableList(cars);
    }

    public List<Truck> findVehicleByWeight(Station station, int weight) throws NoSuchVehicleException {
        List<Vehicle> vehicles = station.getVehicles();
        ArrayList<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i).getVehicleType() == VehicleType.TRUCK)
            {
                Truck truck = (Truck) vehicles.get(i);
                if(truck.getGrossWeight() >= weight) {
                    trucks.add(truck);
                }
            }
        }

        Sorter sorter = new Sorter();

        sorter.sortByWeight(trucks);

        return Collections.unmodifiableList(trucks);
    }

}
