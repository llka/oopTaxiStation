package ru.ilka.taxi.station.filter;


import ru.ilka.taxi.vehicle.Car;
import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class PassengersComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getPassengers() > o2.getPassengers()) {
            return 1;
        }
        else if(o1.getPassengers() < o2.getPassengers()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
