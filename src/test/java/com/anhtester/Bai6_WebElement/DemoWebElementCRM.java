package com.anhtester.Bai6_WebElement;

import com.anhtester.LocatorCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementCRM {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin1@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");

//        driver.findElement(By.xpath(LocatorCRM.inputPassword)).submit();

        System.out.println("headerLogin: " + driver.findElement(By.xpath(LocatorCRM.headerLogin)).getText());
        System.out.println("Tag name headerLogin: " + driver.findElement(By.xpath(LocatorCRM.headerLogin)).getTagName());
        System.out.println("Css background-color (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("background-color"));
        System.out.println("Css color (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("color"));
        System.out.println("Css font-size (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("font-size"));
        System.out.println("Css height (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("height"));
        System.out.println("Css width (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("width"));
        System.out.println("Css font-family (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("font-family"));

        //Get Attribute
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputPassword)).getAttribute("value"));

        //Get Size
        System.out.println("Height width (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getSize());
        System.out.println("Height (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getSize().getHeight());
        System.out.println("Width (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getSize().getWidth());

        //Get Location
        System.out.println("X (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getLocation().x);
        System.out.println("Y (Login button): " + driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getLocation().y);

        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        System.out.println("alertErrorMessage: " + driver.findElement(By.xpath(LocatorCRM.alertErrorMessage)).isDisplayed());

//        driver.get("https://anhtester.com/");
//        System.out.println("h1 isDisplayed (Header page display:none): " + driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed());
//        System.out.println("isDisplayed (Login button): " + driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed());

        driver.quit();
    }

}
