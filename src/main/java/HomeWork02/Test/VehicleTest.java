package HomeWork02.Test;

import HomeWork02.src.Car;
import HomeWork02.src.Motorcycle;
import HomeWork02.src.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Volvo", "XC90", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("BMW", "X5", 2000);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "RM17", 1993);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("VolksWagen", "Passat", 2019);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "RM17", 1993);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCarPark() {
        Car car = new Car("VolksWagen", "Passat", 2019  );
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Honda", "RM17", 1993);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}