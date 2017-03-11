package ru.ilka.taxi.vehicle.builder;

import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.Bus;
import ru.ilka.taxi.vehicle.type.BusBodyType;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class BusBuilder extends VehicleBuilder<Bus> {
    static final int BODY_TYPE_POSITION = 9;
    static final int SEATS_POSITION = 10;
    public BusBuilder() {
        super(new Bus());
    }

    public Bus parse(List<String> input) throws WrongInputException {
        vehicle = super.parse(input);

        try{
            vehicle.setBodyType(BusBodyType.valueOf(input.get(BODY_TYPE_POSITION)));
            vehicle.setSeats(Integer.parseInt(input.get(SEATS_POSITION)));
        }catch (IndexOutOfBoundsException | IllegalArgumentException e){
            throw new WrongInputException(e);
        }

        return vehicle;
    }


    public Bus build(){
        return new Bus(vehicle);
    }

}
