package ru.yandex;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

        driver.findElement(By.id("glpriceto")).sendKeys("15000"); // установка цены до 30000р

        WebElement checkbox1 = driver.findElement(By.xpath("//div[@class=\"LhMupC0dLR\"]/span[text()='DELL']")); // выбор чекбокса DELL
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//div[@class=\"LhMupC0dLR\"]/span[text()='Lenovo']")); // выбор чекбокса Lenovo
        checkbox2.click();

        List<WebElement> allLinks = driver.findElements(By.xpath("//div/div[@class=\"n-snippet-card2__title\"]/a[contains(text(),\"Ноутбук\")]"));
        System.out.println(allLinks.size());

            if (allLinks.size()== 48) {
                System.out.println("Количество элементов на странице верное = 48"); // проверка количества элементов на странице
            } else {
                System.out.println("Ошибка");
            }

        WebElement firstNotebock = driver.findElement(By.xpath("//div/a[text()='Ноутбук Lenovo V130 15']")); // выбор первого элемента
        System.out.println(firstNotebock);

        // wait.until(ExpectedConditions.elementToBeClickable(By.id("ID")));
        // driver.switchTo().frame(driver.findElement(By.id("header-search")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("header-search"))); // проверка поля "поиск"
        driver.findElement(By.id("header-search")).sendKeys("Ноутбук Lenovo V130 15\n"); // поиск первого элемента

        WebElement firstNotebock2 = driver.findElement(By.xpath("//div/a[@title='Ноутбук Lenovo V130 15']")); // выбор первого элемента в получившемся поиске
        System.out.println(firstNotebock2);

        String title2 = driver.findElement(By.xpath("//div/a[@title='Ноутбук Lenovo V130 15']")).getText();
        System.out.println(title2);

        // Assert.assertTrue(title2.equals("Ноутбук Lenovo V130 15"));
        // System.out.println("Проверка успешна");

        if (title2.equals("Ноутбук Lenovo V130 15")) { // проверка соответствия
            System.out.println("Проверка успешна2"); // проверка
        }
        else {
            System.out.println("Ошибка");
        }
    }

    @Test

    public void openSite2 () {

        driver.get("https://yandex.ru/"); // открытие сайта yandex.ru
        driver.manage().window().maximize(); // разворачивание окна на весь экран
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс")); // проверка загрузки сайта- поиск тайтла Яндекс
        WebElement buttonMarket = driver.findElement(By.xpath("//a[text()='Маркет']")); // переход в яндекс маркет
        buttonMarket.click();

        WebElement buttonTech = driver.findElement(By.xpath("//a/span[contains(text(), 'Компьютерная техника')]")); // переход Компьютерная техника
        buttonTech.click();

        WebElement buttonNote = driver.findElement(By.xpath("//div/a[contains(text(), \"Планшеты\")]")); // переход Планшеты
        buttonNote.click();

        // wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class=\"n-snippet-card2__title\"]/a[contains(text(), \"Планшет\")]")));

        driver.findElement(By.id("glpricefrom")).sendKeys("20000"); // установка цены от 20000р
        driver.findElement(By.id("glpriceto")).sendKeys("25000"); // установка цены до 25000р



        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"LhMupC0dLR\"]/span[text()='ASUS']"))); // проверка поля "поиск"
        WebElement checkbox5 = driver.findElement(By.xpath("//a[1][@class=\"_2Wg9rE1HzR\"]")); // выбор чекбокса Acer
        checkbox5.click();

        WebElement checkbox3 = driver.findElement(By.xpath("//div[@class=\"LhMupC0dLR\"]/span[text()='Acer']")); // выбор чекбокса Acer
        checkbox3.click();

        WebElement checkbox4 = driver.findElement(By.xpath("//div[@class=\"LhMupC0dLR\"]/span[text()='ASUS']")); // выбор чекбокса DELL
        checkbox4.click();



        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]")));


        String count2 = driver.findElement(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]")).getAttribute("data-bem");

        System.out.println(count2);

        int count = driver.findElements(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]")).size();
        System.out.println(count);

        // List<WebElement> allLinks2 = driver.findElements(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]"));
        //System.out.println(allLinks2.size());

        if (count== 48) {
           System.out.println("Количество элементов на странице верное = 48"); // проверка количества элементов на странице
        } else {
            System.out.println("Ошибка");
        }

        WebElement firstPlan2= driver.findElement(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]")); // выбор первого элемента
        System.out.println(firstPlan2);


    }
}
