
class main {


    public static void main(String[] args) {
        Engine engine = new Engine(200, 200, TorqueUnit.NewtonMeters, 400, VolumeUnit.SquareCentimeters);
        Gearbox gearbox = new Gearbox(6);

        Vehicle vehicle = new Vehicle(Brand.FERRARI, engine, gearbox, VehicleType.CABRIOLET);

        System.out.println(vehicle.vehicleParameters());

    }

}

enum VehicleType {
    SUV, COUPLE, CABRIOLET
}

enum Brand {
    BMW, FIAT, FERRARI
}

enum VolumeUnit {
    SquareCentimeters;
}

enum TorqueUnit {
    NewtonMeters, FootPounds
}


class Vehicle {
    private final VehicleType type;

    private final Brand brand;

    private final Engine engine;

    private final Gearbox gearbox;

    public Vehicle(Brand brand, Engine engine, Gearbox gearbox, VehicleType type) {
        this.brand = brand;
        this.engine = engine;
        this.gearbox = gearbox;
        this.type = type;
    }

    public String vehicleParameters() {
        return String.format("Vehicle type: %s \nBrand: %s \nEngine Specs: \n%s \nGearbox Specs:\n%s", type.toString(), brand.toString(), engine.engineSpecs(), gearbox.gearboxSpecs());
    }


}


class Engine {
    private int horsepower;

    private int torque;

    private TorqueUnit torqueUnit;

    private int cylinderVolume;

    private VolumeUnit volumeUnit;


    public Engine(int horsepower, int torque, TorqueUnit torqueUnit, int cylinderVolume, VolumeUnit volumeUnit) {
        this.horsepower = horsepower;
        this.torque = torque;
        this.torqueUnit = torqueUnit;
        this.cylinderVolume = cylinderVolume;
        this.volumeUnit = volumeUnit;
    }

    public String engineSpecs() {
        return String.format("\tHorsePower: %d\n\tTorque: %d %s\n\tCylinder Volume: %d %s", horsepower, torque, torqueUnit, cylinderVolume, volumeUnit.toString());
    }

}

class Gearbox {

    private int numberOfGears;

    public Gearbox(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String gearboxSpecs() {
        return String.format("\tNumber of gears: %d", numberOfGears);
    }

}