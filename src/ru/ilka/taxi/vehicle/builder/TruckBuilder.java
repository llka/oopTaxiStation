package ru.ilka.taxi.vehicle.builder;

import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.Truck;
import ru.ilka.taxi.vehicle.type.HydraulicInstallationType;
import ru.ilka.taxi.vehicle.type.WheelFormula;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class TruckBuilder extends VehicleBuilder<Truck> {
    static final int AXELS_POSITION = 9;
    static final int WHEEL_FORMULA_POSITION = 10;
    static final int GROSS_WEIGHT_POSITION = 11;
    static final int HYDRAULIC_TYPE_POSITION = 12;
    public TruckBuilder() {
        super(new Truck());
    }

    public Truck parse(List<String> input) throws WrongInputException {
        vehicle = super.parse(input);

        try{
            vehicle.setAxels(Integer.parseInt(input.get(AXELS_POSITION)));
            vehicle.setWheelFormula(WheelFormula.valueOf(input.get(WHEEL_FORMULA_POSITION)));
            vehicle.setGrossWeight(Integer.parseInt(input.get(GROSS_WEIGHT_POSITION)));
            vehicle.setHydraulicInstallationType(HydraulicInstallationType.valueOf(input.get(HYDRAULIC_TYPE_POSITION)));
        }catch (IndexOutOfBoundsException | IllegalArgumentException e){
            throw new WrongInputException(e);
        }

        return vehicle;
    }

    public Truck build(){
        return new Truck(vehicle);
    }
}
