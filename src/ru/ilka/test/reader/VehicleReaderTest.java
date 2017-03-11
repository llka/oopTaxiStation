package ru.ilka.test.reader;

import org.junit.Assert;
import org.junit.Test;
import ru.ilka.taxi.station.reader.VehicleReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class VehicleReaderTest {

    @Test
    public void readVehiclesTest() {
        VehicleReader vehicleReader = new VehicleReader();
        List<List<String>> actual = vehicleReader.readVehicles("data/input.txt");
        ArrayList<List<String>> expected = new ArrayList<>();

        expected.add(new ArrayList<String>());
        expected.get(0).add("VW");
        expected.get(0).add("Golf");
        expected.get(0).add("CAR");
        expected.get(0).add("6000");
        expected.get(0).add("120");
        expected.get(0).add("5");
        expected.get(0).add("MANUAL");
        expected.get(0).add("PETROL");
        expected.get(0).add("5");
        expected.get(0).add("5");
        expected.get(0).add("8.8");
        expected.get(0).add("COUPE");
        expected.get(0).add("SMALL");

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testForReadVehiclesException() throws RuntimeException {
        VehicleReader vehicleReader = new VehicleReader();
        List<List<String>> actual = vehicleReader.readVehicles("FileNotFound.txt");
    }
}
