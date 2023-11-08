package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//button[text()='Zezwól na wszystkie pliki cookie']";

    public static final String XPATH_NEWACCOUNT = "//a[text()='Utwórz nowe konto']";

    public static final String XPATH_SELECTDAY = "//div[contains(@class, \"_5k_5\")]/span/select[1]";
    public static final String XPATH_SELECTMONTH = "//div[contains(@class, \"_5k_5\")]/span/select[2]";
    public static final String XPATH_SELECTYEAR = "//div[contains(@class, \"_5k_5\")]/span/select[3]";
    public static final String XPATH_WAIT ="//div[@class='al64']";
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        Thread.sleep(4000);

        while (!driver.findElement(By.xpath(XPATH_WAIT)).isDisplayed());


        WebElement acceptCookies= driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement newAccount= driver.findElement(By.xpath(XPATH_NEWACCOUNT));
        newAccount.click();


        WebElement day = driver.findElement(By.xpath(XPATH_SELECTDAY));
        Select daySelect = new Select(day);
        daySelect.selectByValue("9");

        WebElement month = driver.findElement(By.xpath(XPATH_SELECTMONTH));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("9");

        WebElement year = driver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select yearSelect = new Select(year);
        yearSelect.selectByValue("2002");




    }
}
