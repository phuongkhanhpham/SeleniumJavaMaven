package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.LocatorCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class DemoCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();

        driver.findElement(By.xpath(LocatorCRM.menuTasks)).click();
        driver.findElement(By.xpath(LocatorCRM.buttonNewTask)).click();

        Thread.sleep(2000);
        System.out.println("isSelected: (Public)" + driver.findElement(By.xpath("//input[@id='task_is_public']")).isSelected());

        //Click chọn checkbox Public
        driver.findElement(By.xpath("//input[@id='task_is_public']")).click();
//        driver.findElement(By.xpath("//label[text()='Public']")).click();

        //Kiểm tra checkbox đã được check hay chưa
        System.out.println("isSelected: (Public)" + driver.findElement(By.xpath("//input[@id='task_is_public']")).isSelected());

        boolean isSelected = driver.findElement(By.xpath("//input[@id='task_is_billable']")).isSelected();
        System.out.println("isSelected: (Billable)" + isSelected);

        //Nếu chưa được check thì click vào ô checkbox đó
        if (isSelected == false) {
            System.out.println("Click chọn checkbox Public");
            driver.findElement(By.xpath("//input[@id='task_is_billable']")).click();
        }

        Thread.sleep(2000);
        closeDriver();

    }
}
