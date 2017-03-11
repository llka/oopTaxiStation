package ru.ilka.taxi.station.creator;


import org.apache.log4j.Logger;
import ru.ilka.taxi.exception.NoSuchVehicleException;
import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.factory.VehicleFactory;
import ru.ilka.taxi.station.Station;
import ru.ilka.taxi.station.reader.VehicleReader;
import ru.ilka.taxi.vehicle.builder.VehicleBuilder;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class StationCreator {
    static Logger logger = Logger.getLogger(StationCreator.class);
    static final int VEHICLE_TYPE_POSITION = 2;

    public Station createStation(String filePath) throws WrongInputException {
        VehicleFactory vehicleFactory = new VehicleFactory();
        VehicleReader vehicleReader = new VehicleReader();
        Station station = new Station();
        List<List<String>> input;

        input = vehicleReader.readVehicles(filePath);

        for (int i = 0; i < input.size() ; i++) {
            try {
                station.addVechicle(getBuilder(vehicleFactory, input.get(i)).parse(input.get(i)));
            } catch (IllegalArgumentException | NoSuchVehicleException e) {
                throw new WrongInputException(e);
            }
        }
        return station;
    }

    public VehicleBuilder getBuilder(VehicleFactory factory, List<String> input) throws NoSuchVehicleException {
        return factory.createVehicleBuilder(input.get(VEHICLE_TYPE_POSITION));
    }
}

