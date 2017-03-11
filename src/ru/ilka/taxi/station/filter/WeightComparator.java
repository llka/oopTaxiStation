package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Truck;

import java.util.Comparator;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class WeightComparator implements Comparator<Truck> {
    @Override
     public int compare(Truck o1, Truck o2) {
            if(o1.getGrossWeight() > o2.getGrossWeight()) {
                return 1;
            }
            else if(o1.getGrossWeight() < o2.getGrossWeight()){
                return -1;
            }
            else {
                return 0;
            }
        }
}
