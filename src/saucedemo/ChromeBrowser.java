package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open URL into the Browser
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get the Page Source
        System.out.println("Page source : " + driver.getPageSource());
        //Find Username Field
        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");
        //Find Password Field
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");

        //Close the browser
        driver.close();


    }

}
