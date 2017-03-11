package ru.ilka.taxi.factory;

import ru.ilka.taxi.exception.NoSuchVehicleException;
import ru.ilka.taxi.vehicle.builder.BusBuilder;
import ru.ilka.taxi.vehicle.builder.CarBuilder;
import ru.ilka.taxi.vehicle.builder.TruckBuilder;
import ru.ilka.taxi.vehicle.builder.VehicleBuilder;
import ru.ilka.taxi.vehicle.type.VehicleType;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class VehicleFactory {
    public VehicleBuilder createVehicleBuilder(String vehicleType ) throws NoSuchVehicleException {

        VehicleType input;

        try {
            input = VehicleType.valueOf(vehicleType);
        }catch (IllegalArgumentException e){
            throw new NoSuchVehicleException(e);
        }

        switch (input){
            case BUS:
                return new BusBuilder();
            case CAR:
               return new CarBuilder();
            case TRUCK:
                return new TruckBuilder();
            default:
                throw new NoSuchVehicleException();
        }
    }
}
