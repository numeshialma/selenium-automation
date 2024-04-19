package testNG.part_05;

import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    public void startCar() {
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar() {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    public void stopCar() {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar" , "stopCar"})
    public void parkCar() {
        System.out.println("Car parked");
    }

}
