package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class ModelComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        String m1 = o1.getModel();
        String m2 = o2.getModel();

        return m1.compareTo(m2);
    }
}
