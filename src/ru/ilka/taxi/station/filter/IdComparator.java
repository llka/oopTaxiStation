package ru.ilka.taxi.station.filter;

import ru.ilka.taxi.vehicle.Vehicle;

import java.util.Comparator;

/**
 * ����� ����� �� ���� ���� ������� +375(29)3880490
 */
public class IdComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if(o1.getId() > o2.getId()) {
            return 1;
        }
        else if(o1.getId() < o2.getId()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
