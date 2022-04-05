package Liskov;

interface Car {
    void turnOnEngine() throws Exception;

    void accelerate();
}

class MotorCar implements Car {
    @Override
    public void turnOnEngine() {
        System.out.println("Hello I'm working!");
    }

    @Override
    public void accelerate() {
        System.out.println("Run run");

    }
}

class ElectricCar implements Car {

    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("Ay ayayayaya no tengo motor");
    }

    @Override
    public void accelerate() {

    }
}


class TestLiskov {
    public static void main(String[] args) throws Exception {
        Car car = new MotorCar();
        // car = new ElectricCar();
        car.turnOnEngine();
        car.accelerate();
    }
}