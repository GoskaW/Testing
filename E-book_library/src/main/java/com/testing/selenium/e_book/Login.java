package com.testing.selenium.e_book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Goska\\Documents\\Development\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ta-bookrental-fe.onrender.com/login");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        WebElement user = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[1]"));
        user.sendKeys("kodilla");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[2]"));
        password.sendKeys("kodilla");

        WebElement logIn = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));
        logIn.click();

    }
}
