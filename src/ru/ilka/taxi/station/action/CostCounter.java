package ru.ilka.taxi.station.action;

import org.apache.log4j.Logger;
import ru.ilka.taxi.station.Station;
import ru.ilka.taxi.vehicle.Vehicle;

import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class CostCounter {
    static Logger logger = Logger.getLogger(CostCounter.class);

    public int calculateStationCost(Station station){
        int sum = 0;
        List<Vehicle> vehicles = station.getVehicles();

        for (int i = 0; i < vehicles.size() ; i++) {
            sum += vehicles.get(i).getCost();
        }

        logger.info("All vehicles cost " + sum + "$");
        return sum;
    }
}
