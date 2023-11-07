package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
//        driver = new FirefoxDriver();
    }

    @Test
    public void testNavigation() {
        // Open the base URL
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        
        // Click on the "All Examples" element
        driver.findElement(By.linkText("All Examples")).click();
        driver.findElement(By.linkText("All Examples")).click();

        // Navigate to the "Input Forms" menu
//        driver.findElement(By.xpath("//a[contains(text(), 'Input Forms')]")).click();
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();

        // Navigate to the "Simple Form Demo" menu
//        driver.findElement(By.linkText("Simple Form Demo")).click();
//        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a")).click();
//        Waiting for 5 seconds
        try {
            Thread.sleep(5000); // 5 másodperc = 5000 ezredmásodperc
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
