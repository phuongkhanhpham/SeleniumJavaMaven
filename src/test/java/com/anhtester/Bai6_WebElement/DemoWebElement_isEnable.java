package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_LocatorElement.LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_isEnable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
//        driver.findElement(By.xpath("//span[text()='Run this project']")).click();
//        System.out.println(driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled());
//        System.out.println(driver.findElement(By.xpath("//button[text()='\"Hacked\" Submit button']")).isEnabled());
//        System.out.println(driver.findElement(By.xpath("//button[text()='\"Hacked\" Submit button']")).getText());

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorCRM.checkboxRememberMe)).click();

        System.out.println(driver.findElement(By.xpath(LocatorCRM.checkboxRememberMe)).isSelected());

        driver.quit();
    }
}
