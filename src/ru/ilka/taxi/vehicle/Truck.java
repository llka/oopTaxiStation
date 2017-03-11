package ru.ilka.taxi.vehicle;

import ru.ilka.taxi.vehicle.type.*;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class Truck extends Vehicle {
    private int axels;
    private WheelFormula wheelFormula;
    private int grossWeight;
    private HydraulicInstallationType hydraulicInstallationType;

    public Truck(int axels, WheelFormula wheelFormula, int gvw, HydraulicInstallationType hydraulicInstallationType) {
        this.axels = axels;
        this.wheelFormula = wheelFormula;
        this.grossWeight = gvw;
        this.hydraulicInstallationType = hydraulicInstallationType;
    }

    public Truck(String make, String model,VehicleType vehicleType, int cost, int power, int doors, GearBoxType gearBox, FuelType fuel, long id, int axels, WheelFormula wheelFormula, int gvw, HydraulicInstallationType hydraulicInstallationType) {
        super(make, model, vehicleType, cost, power, doors, gearBox, fuel, id);
        this.axels = axels;
        this.wheelFormula = wheelFormula;
        this.grossWeight = gvw;
        this.hydraulicInstallationType = hydraulicInstallationType;
    }

    public Truck(Vehicle vehicle, int axels, WheelFormula wheelFormula, int gvw, HydraulicInstallationType hydraulicInstallationType) {
        super(vehicle);
        this.axels = axels;
        this.wheelFormula = wheelFormula;
        this.grossWeight = gvw;
        this.hydraulicInstallationType = hydraulicInstallationType;
    }

    public Truck(Vehicle vehicle){
        super(vehicle);
        this.axels = 2;
        this.wheelFormula = WheelFormula.FOUR_TWO;
        this.grossWeight = 7;
        this.hydraulicInstallationType = HydraulicInstallationType.TIPPER;
    }

    public Truck(Truck truck){

    }

    public Truck(){

    }

    public int getAxels() {
        return axels;
    }

    public void setAxels(int axels) {
        this.axels = axels;
    }

    public WheelFormula getWheelFormula() {
        return wheelFormula;
    }

    public void setWheelFormula(WheelFormula wheelFormula) {
        this.wheelFormula = wheelFormula;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(int gvw) {
        this.grossWeight = gvw;
    }

    public HydraulicInstallationType getHydraulicInstallationType() {
        return hydraulicInstallationType;
    }

    public void setHydraulicInstallationType(HydraulicInstallationType hydraulicInstallationType) {
        this.hydraulicInstallationType = hydraulicInstallationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Truck truck = (Truck) o;

        if (axels != truck.axels) return false;
        if (wheelFormula != truck.wheelFormula) return false;
        if (grossWeight != truck.grossWeight) return false;
        return hydraulicInstallationType == truck.hydraulicInstallationType;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + axels + grossWeight;
        result = 31 * result + wheelFormula.hashCode();
        result = 31 * result + hydraulicInstallationType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", axels=" + axels +
                ", wheelFormula=" + wheelFormula +
                ", gvw=" + grossWeight +
                ", hydraulicInstallationType=" + hydraulicInstallationType +
                '}';
    }
}
