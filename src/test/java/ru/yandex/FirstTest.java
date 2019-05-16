package ru.yandex;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FirstTest extends Configuration{

    @Test
    public void openSite () {

        driver.get("https://yandex.ru/"); // открытие сайта yandex.ru
        driver.manage().window().maximize(); // разворачивание окна на весь экран
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс")); // проверка загрузки сайта- поиск тайтла Яндекс
        WebElement buttonMarket = driver.findElement(By.xpath("//a[text()='Маркет']")); // переход в яндекс маркет
        buttonMarket.click();

        WebElement buttonTech = driver.findElement(By.xpath("//a/span[contains(text(), 'Компьютерная техника')]")); // переход Компьютерная техника
        buttonTech.click();

        WebElement buttonNote = driver.findElement(By.xpath("//div/a[contains(text(), \"Ноутбуки\")]")); // переход Ноутбуки
        buttonNote.click();

        driver.findElement(By.id("glpricefrom")).sendKeys("10000"); // установка значения цены от 10000р

        wait.until((WebDriver d) -> d.findElement(By.id("glpriceto"))); // явное ожидание поля "установка цены"

        driver.findElement(By.id("glpriceto")).sendKeys("25000"); // установка цены до 25000р
    }

}
