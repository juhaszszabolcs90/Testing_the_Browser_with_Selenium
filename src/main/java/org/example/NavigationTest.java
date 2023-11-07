package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest extends TestSetup{

    @Before
    public void setUp() {
        initialize();
    }

    @Test
    public void testNavigation() {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");

        // Click on the "All Examples" element
        driver.findElement(By.linkText("All Examples")).click();
        driver.findElement(By.linkText("All Examples")).click();

        // Navigate to the "Input Forms" menu
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();

        // Navigate to the "Simple Form Demo" menu
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();
        System.out.println("First task finished");
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}
