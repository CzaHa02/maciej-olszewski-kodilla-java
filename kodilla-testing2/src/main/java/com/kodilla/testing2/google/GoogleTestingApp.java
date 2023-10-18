package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELDGOOGLE = "q";
    public static final String SEARCHFIELDEBAY = "_nkw";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com/");

        // pomijanie warunków google
        // driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        WebElement searchField = driver.findElement(By.name(SEARCHFIELDEBAY));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}