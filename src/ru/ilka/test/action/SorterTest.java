package ru.ilka.test.action;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.ilka.taxi.station.Station;
import ru.ilka.taxi.station.action.CostCounter;
import ru.ilka.taxi.station.action.Sorter;
import ru.ilka.taxi.vehicle.Bus;
import ru.ilka.taxi.vehicle.Car;
import ru.ilka.taxi.vehicle.Truck;
import ru.ilka.taxi.vehicle.type.*;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class SorterTest {

    private Station station;
    private Sorter sorter;

    @Before
    public void initStation(){
        station = new Station();
        sorter = new Sorter();
        Car impreza = new Car("Subaru","Impreza", VehicleType.CAR, 15000, 220, 3, GearBoxType.MANUAL, FuelType.PETROL
                ,6,5,4.8, CarBodyType.SPORTS_CAR, LuggageSize.SMALL);
        Car golf = new Car("VW","Golf", VehicleType.CAR, 6000, 120, 5, GearBoxType.MANUAL, FuelType.PETROL
                ,5,5,8.8,CarBodyType.COUPE,LuggageSize.SMALL);
        Truck maz = new Truck("MAZ","103",VehicleType.TRUCK,25000,300,2,GearBoxType.AUTOMATIC,FuelType.DISIL
                ,4,2,WheelFormula.FOUR_TWO,10,HydraulicInstallationType.TIPPER);
        Truck kraz = new Truck("KRAZ","3",VehicleType.TRUCK,1000,450,3,GearBoxType.MANUAL,FuelType.DISIL
                ,3,2,WheelFormula.EIGHT_FOUR,20,HydraulicInstallationType.TIPPER);
        Bus gazel = new Bus("Gaz","2752",VehicleType.BUS, 8000, 110, 6, GearBoxType.MANUAL, FuelType.DISIL
                ,2,BusBodyType.PUBLIC_TRANSPORT,16);
        Bus mers = new Bus("Mercedes","Sprinter",VehicleType.BUS,18000,150,8,GearBoxType.AUTOMATIC,FuelType.DISIL
                ,1,BusBodyType.PUBLIC_TRANSPORT,24);

        station.addVechicle(golf);
        station.addVechicle(impreza);
        station.addVechicle(maz);
        station.addVechicle(kraz);
        station.addVechicle(gazel);
        station.addVechicle(mers);
    }

    @Test
    public void sortByIdTest() {
        sorter.sortById(station.getVehicles());
        int expected = 3;
        int actual = (int) station.getVehicles().get(2).getId();
        Assert.assertEquals(actual, expected, 0.01);
    }

    /* just showing results of sorting by a lot of params */
    @Test
    public void sortByGearBoxTest() {
        sorter.sortByGearBox(station.getVehicles());
    }

    @Test
    public void sortByCostTest() {
        sorter.sortByCost(station.getVehicles());
    }
    @Test
    public void sortByFuelTest() {
        sorter.sortByFuel(station.getVehicles());
    }
}
