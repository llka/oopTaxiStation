package ru.ilka.test.builder;

import org.junit.Before;
import org.junit.Test;
import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.builder.BusBuilder;
import ru.ilka.taxi.vehicle.builder.CarBuilder;
import ru.ilka.taxi.vehicle.builder.TruckBuilder;
import ru.ilka.taxi.vehicle.builder.VehicleBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class InputFormatTest {

    private List<String> param;

    @Before
    public void initParams(){
        param = new ArrayList<>();
        param.add("VW");
        param.add("Golf");
        param.add("CAR");
        param.add("6000");
        param.add("120");
        param.add("bla");
        param.add("bla");
        param.add("bla");
        param.add("bla");
        param.add("bla");
        param.add("MANUAL");
        param.add("bla");
        param.add("bla");
        param.add("bla");
        param.add("COUPE(NO)");
        param.add("SMALL(NO)");
    }

    @Test(expected = WrongInputException.class)
    public void testInputForBusParameters() throws WrongInputException {
        VehicleBuilder builder = new BusBuilder();
        builder.parse(param);
    }

    @Test(expected = WrongInputException.class)
    public void testInputForCarParameters() throws WrongInputException {
        VehicleBuilder builder = new CarBuilder();
        builder.parse(param);
    }

    @Test(expected = WrongInputException.class)
    public void testInputForTruckParameters() throws WrongInputException {
        VehicleBuilder builder = new TruckBuilder();
        builder.parse(param);
    }
}
