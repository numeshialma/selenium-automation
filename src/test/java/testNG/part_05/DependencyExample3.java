package testNG.part_05;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample3 {

    @Test
    public void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar() {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    public void stopCar() {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar" , "stopCar"} , alwaysRun = true)
    public void parkCar() {
        System.out.println("Car parked");
    }

}
