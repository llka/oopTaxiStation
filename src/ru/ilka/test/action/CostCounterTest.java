package ru.ilka.test.action;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.ilka.taxi.station.Station;
import ru.ilka.taxi.station.action.CostCounter;
import ru.ilka.taxi.station.action.Sorter;
import ru.ilka.taxi.vehicle.Car;
import ru.ilka.taxi.vehicle.type.*;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class CostCounterTest {

    private Station station;

    @Before
    public void initStation(){
        station = new Station();
        Car impreza = new Car("Subaru","Impreza", VehicleType.CAR, 15000, 220, 3, GearBoxType.MANUAL, FuelType.PETROL,
                1,5,4.8,CarBodyType.SPORTS_CAR,LuggageSize.SMALL);
        Car golf = new Car("WV","Golf", VehicleType.CAR, 6000, 120, 5, GearBoxType.MANUAL, FuelType.PETROL,
                2,5,8.8,CarBodyType.COUPE,LuggageSize.SMALL);
        station.addVechicle(golf);
        station.addVechicle(impreza);
    }

    @Test
    public void calculateStationCostTest() {
        CostCounter costCounter = new CostCounter();
        int expected = 21000;
        int actual = costCounter.calculateStationCost(station);
        Assert.assertEquals(actual, expected, 0.01);
    }
}
