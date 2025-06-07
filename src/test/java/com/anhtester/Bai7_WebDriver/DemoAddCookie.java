package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DemoAddCookie {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
//        driver.findElement(By.xpath(LocatorCRM.inputEmail)).clear();
//        driver.findElement(By.xpath(LocatorCRM.inputPassword)).clear();
//        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
//        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();

//        Thread.sleep(1000);
        Cookie newCookie = new Cookie("sp_session", "bvj6afrileg7hbr19gg901g2ajo1bu0d");
        driver.manage().addCookie(newCookie);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
