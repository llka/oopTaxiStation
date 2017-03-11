package ru.ilka.test.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.ilka.taxi.exception.NoSuchVehicleException;
import ru.ilka.taxi.factory.VehicleFactory;
import ru.ilka.taxi.vehicle.builder.BusBuilder;
import ru.ilka.taxi.vehicle.builder.CarBuilder;
import ru.ilka.taxi.vehicle.builder.TruckBuilder;
import ru.ilka.taxi.vehicle.builder.VehicleBuilder;


/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @Before
    public void initVehicleFactory(){
        vehicleFactory = new VehicleFactory();
    }

    @Test
    public void createBusBuilderTest(){
        Class expected = BusBuilder.class;
        Class actual = CarBuilder.class;

        try {
            actual = vehicleFactory.createVehicleBuilder("BUS").getClass();
        }catch (NoSuchVehicleException e){
            Assert.fail();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCarBuilderTest(){
        Class expected = CarBuilder.class;
        Class actual = BusBuilder.class;

        try {
            actual = vehicleFactory.createVehicleBuilder("CAR").getClass();
        }catch (NoSuchVehicleException e){
            Assert.fail();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createTruckBuilderTest(){
        Class expected = TruckBuilder.class;
        Class actual = BusBuilder.class;

        try {
            actual = vehicleFactory.createVehicleBuilder("TRUCK").getClass();
        }catch (NoSuchVehicleException e){
            Assert.fail();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NoSuchVehicleException.class)
    public void createWithWrongDataTest() throws NoSuchVehicleException {
        VehicleBuilder actual = vehicleFactory.createVehicleBuilder("blablabla");
    }
}
