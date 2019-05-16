package ru.yandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class Configuration {

    public ChromeDriver driver;
    public WebDriverWait wait;

    @Before

    public void setting() {
        System.setProperty("webdriver.chrome.driver", "/H:/Автотесты/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // неявное ожидание 5 сек

        wait = new WebDriverWait(driver, 10); // явное ожидание 10 сек
    }

    @After

     public void close() {
      driver.quit();
   }
}
