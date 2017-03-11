package ru.ilka.taxi.vehicle.builder;

import ru.ilka.taxi.exception.WrongInputException;
import ru.ilka.taxi.vehicle.Vehicle;

import java.util.List;

/**
 * ����� ����� �� ���� ���� ������� +375(29)3880490
 */
public interface VehicleBuilderInterface<T extends Vehicle> {
    T parse(List<String> input) throws WrongInputException;
    T build();
}
