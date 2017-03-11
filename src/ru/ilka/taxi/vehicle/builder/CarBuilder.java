package ru.ilka.taxi.vehicle.builder;

import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.Car;
import ru.ilka.taxi.vehicle.type.*;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class CarBuilder extends VehicleBuilder<Car> {
    static final int PASSENFERS_POSITION = 9;
    static final int TIME_POSITION = 10;
    static final int BODY_TYPE_POSITION = 11;
    static final int LUGGAGE_SIZE_POSITION = 12;
    public CarBuilder() {
        super(new Car());
    }

    public Car parse(List<String> input) throws WrongInputException {
        vehicle = super.parse(input);
        try{
            vehicle.setPassengers(Integer.parseInt(input.get(PASSENFERS_POSITION)));
            vehicle.setTimeToHundred(Integer.parseInt(input.get(TIME_POSITION)));
            vehicle.setBodyType(CarBodyType.valueOf(input.get(BODY_TYPE_POSITION)));
            vehicle.setLuggageSize(LuggageSize.valueOf(input.get(LUGGAGE_SIZE_POSITION)));
        }catch (IndexOutOfBoundsException | IllegalArgumentException e){
            throw new WrongInputException(e);
        }

        return vehicle;
    }

    public Car build(){
        return new Car(vehicle);
    }
}
