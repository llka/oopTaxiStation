package ru.ilka.taxi.vehicle.builder;

import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.Vehicle;
import ru.ilka.taxi.vehicle.type.FuelType;
import ru.ilka.taxi.vehicle.type.GearBoxType;
import ru.ilka.taxi.vehicle.type.VehicleType;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public abstract class VehicleBuilder <T extends Vehicle > implements VehicleBuilderInterface<T> {
    static final int MAKE_POSITION = 0;
    static final int MODEL_POSITION = 1;
    static final int VEHICLE_TYPE_POSITION = 2;
    static final int COST_POSITION = 3;
    static final int POWER_POSITION = 4;
    static final int DOORS_POSITION = 5;
    static final int FUEL_POSITION = 6;
    static final int GEARBOX_POSITION = 7;
    static final int VEHICLE_ID_POSITION = 8;
    protected T vehicle;

    public VehicleBuilder(T vehicle){
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public T parse(List<String> input) throws WrongInputException {
        try {
            vehicle.setMake(input.get(MAKE_POSITION));
            vehicle.setModel(input.get(MODEL_POSITION));
            vehicle.setVehicleType(VehicleType.valueOf(input.get(VEHICLE_TYPE_POSITION)));
            vehicle.setCost(Integer.parseInt(input.get(COST_POSITION)));
            vehicle.setPower(Integer.parseInt(input.get(POWER_POSITION)));
            vehicle.setDoors(Integer.parseInt(input.get(DOORS_POSITION)));
            vehicle.setFuel(FuelType.valueOf(input.get(FUEL_POSITION)));
            vehicle.setGearBox(GearBoxType.valueOf(input.get(GEARBOX_POSITION)));
            vehicle.setId(Integer.parseInt(input.get(VEHICLE_ID_POSITION)));
        }catch (IndexOutOfBoundsException | IllegalArgumentException e){
            throw new WrongInputException(e);
        }
        return vehicle;
    }

    public T build(){
        return vehicle;
    }
}
