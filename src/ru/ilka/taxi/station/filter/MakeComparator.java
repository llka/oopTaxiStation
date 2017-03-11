package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class MakeComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        String m1 = o1.getMake();
        String m2 = o2.getMake();

        return m1.compareTo(m2);
    }
}
