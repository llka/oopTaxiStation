package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;
import ru.ilka.taxi.vehicle.type.FuelType;
import ru.ilka.taxi.vehicle.type.GearBoxType;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class FuelComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return FuelType.valueOf(o1.getFuel().toString()).compareTo(FuelType.valueOf(o2.getFuel().toString()));
    }
}
