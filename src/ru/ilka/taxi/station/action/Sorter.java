package ru.ilka.taxi.station.action;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import ru.ilka.taxi.station.filter.*;
import ru.ilka.taxi.vehicle.Bus;
import ru.ilka.taxi.vehicle.Car;
import ru.ilka.taxi.vehicle.Truck;
import ru.ilka.taxi.vehicle.Vehicle;

import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Sorter {

    static Logger logger = Logger.getLogger(Sorter.class);

    public void sortById(List<Vehicle> vehicles){
        vehicles.sort(new IdComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new IdComparator()))));
        logger.info("ById " + vehicles);
    }

    public void sortByWeight(List<Truck> vehicles){
        vehicles.sort(new WeightComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new IdComparator()))));
        logger.info("ByWeight " + vehicles);
    }

    public void sortBySeats(List<Bus> vehicles){
        vehicles.sort(new SeatsComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new IdComparator()))));
        logger.info("BySeats" + vehicles);
    }

    public void sortByCost(List<Vehicle> vehicles){
        vehicles.sort(new CostComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new GearBoxComparator()
                                    .thenComparing(new IdComparator())))));
        logger.info("By cost" + vehicles);
    }

    public void sortByAccelerationTime(List<Car> vehicles){
        vehicles.sort(new TimeAccComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new PowerComparator()
                                        .thenComparing(new IdComparator())))));
        logger.info("ByAccelerationTime " + vehicles);
    }

    public void sortByGearBox(List<Vehicle> vehicles){
        vehicles.sort(new GearBoxComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                        .thenComparing(new IdComparator()))));
        logger.info("ByGearBox " + vehicles);
    }

    public void sortByFuel(List<Vehicle> vehicles){
        vehicles.sort(new FuelComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                .thenComparing(new IdComparator()))));
        logger.info("ByFuel " + vehicles);
    }

    public void sortByPassengers(List<Car> vehicles){
        vehicles.sort(new PassengersComparator()
                .thenComparing(new MakeComparator()
                        .thenComparing(new ModelComparator()
                                        .thenComparing(new IdComparator()))));
        logger.info("ByPassengers " + vehicles);
    }
}
