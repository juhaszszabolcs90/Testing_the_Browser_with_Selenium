package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondExerciseSingleFieldButton {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSecondExerciseSingleFieldButton() {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();

//    <input type="text" class="form-control" placeholder="Please enter your Message" id="user-message">
        WebElement textbox = driver.findElement(By.id("user-message"));
        textbox.click();
        textbox.sendKeys("Hello");

//        submit button
//     <button type="button" onclick="showInput();" class="btn btn-default">Show Message</button>
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
//        place for the text

        WebElement text = driver.findElement(By.xpath("//*[@id=\"display\"]"));
        System.out.println(text.getText());
        System.out.println(text);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}

