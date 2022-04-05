package InterfaceSegregation;

interface Car {

    void accelerate();
}

interface FuelCar extends Car {
    void turnOnEngine() throws Exception;

}

class MotorCar implements FuelCar {

    @Override
    public void accelerate() {

    }

    @Override
    public void turnOnEngine() throws Exception {

    }
}

class ElectricCar implements Car {

    @Override
    public void accelerate() {

    }
}
