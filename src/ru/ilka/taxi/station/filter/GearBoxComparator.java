package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;
import ru.ilka.taxi.vehicle.type.GearBoxType;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class GearBoxComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return GearBoxType.valueOf(o1.getGearBox().toString()).compareTo(GearBoxType.valueOf(o2.getGearBox().toString()));
    }
}
