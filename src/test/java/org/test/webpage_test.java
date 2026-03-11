package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class webpage_test {

    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://sujithmh.github.io/DEVOPS_DAY2_PROJECT_3/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        String expectedTitle = "THE END";

        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match!");
        Assert.assertTrue(actualTitle.contains("THE END"));
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}