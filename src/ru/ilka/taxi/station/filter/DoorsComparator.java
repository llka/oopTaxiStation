package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class DoorsComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if(o1.getDoors() > o2.getDoors()) {
            return 1;
        }
        else if(o1.getDoors() < o2.getDoors()){
            return -1;
        }
        else {
            return 0;
        }
    }
}