package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class CostComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if(o1.getCost() > o2.getCost()) return 1;
        else if(o1.getCost() < o2.getCost()) return -1;
        else return 0;
    }
}
