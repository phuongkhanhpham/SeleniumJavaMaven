package com.anhtester.Bai5_LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {

        // Setup mở trình duyệt Chrome
        WebDriver driver; // Khởi tạo 1 biến driver có kiểu WebDriver
        driver = new ChromeDriver(); // Khai báo trình duyệt Chrome, rồi gán giá trị vào bến driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Set thời gian chờ 1 element xuất hiện, hết thời gian chưa tìm ra thì báo lỗi

        // Code auto thao tác
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
//        driver.findElement(By.className("btn btn-primary btn-block")).click(); // Gồm 3 class name cách nhau bởi dấu cách, chỉ hỗ trợ tìm từng class name
        driver.findElement(By.className("btn-primary")).click();
//        driver.findElement(By.tagName("button")).click(); // Nhược điểm, hay trùng
        Thread.sleep(1000);
        driver.findElement(By.id("search_input")).sendKeys("Selenium");
        Thread.sleep(1000);

        driver.quit(); // Tắt trình duyệt
    }
}
