package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Bus;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class SeatsComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        if(o1.getSeats() > o2.getSeats()) {
            return 1;
        }
        else if(o1.getSeats() < o2.getSeats()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
