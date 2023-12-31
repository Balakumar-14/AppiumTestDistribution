package com.test.site;

import com.appium.device.Device;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoTwoTest {

    @Test(priority = 1)
    public void demoTwoTestOne() {
        System.out.println("This is a demoTwoTestOne");
        sleep();
    }

    @Test(priority = 2, dependsOnMethods = "demoTwoTestOne")
    public void demoTwoTestTwo() {
        System.out.println("This is a demoTwoTestTwo");
        sleep();
    }

    @Test(priority = 3, dependsOnMethods = "demoTwoTestTwo")
    public void demoTwoTestThree() {
        System.out.println("This is a demoTwoTestThree");
        sleep();
    }

    @Test(priority = 4)
    public void demoTwoTestFour() {
        System.out.println("This is a demoTwoTestFour");
        sleep();
    }
//    @Test(priority = 5, dependsOnMethods = "demoTwoTestTwo")
//    public void demoTwoTestFive() {
//        System.out.println("This is a demoTwoTestThree");
//        sleep();
//    }
//
//    @Test(priority = 6)
//    public void demoTwoTestSix() {
//        System.out.println("This is a demoTwoTestFour");
//        sleep();
//    }


    public void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
