package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ThirdExerciseTwoFieldsAndOutput extends NavigationTest{

    @Before
    public void setUp() {
        initialize();
    }

    @Test
    public void testSecondExerciseSingleFieldButton() {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        // Navigate to the "Input Forms" menu
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();
        // Navigate to "Simple Form Demo"
        driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();

//      First value
//    <input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement firstValueBox = driver.findElement(By.id("sum1"));
        firstValueBox.click();
        firstValueBox.sendKeys("6");

//      Second value
//    <input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement secondValueBox = driver.findElement(By.id("sum2"));
        secondValueBox.click();
        secondValueBox.sendKeys("10");

//        submit button
        //*[@id="gettotal"]/button
//        <button type="button" onclick="return total()" class="btn btn-default">Get Total</button>
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();

//        show result in span
//        <span id="displayvalue">15</span>
        //*[@id="displayvalue"]
        WebElement text = driver.findElement(By.id("displayvalue"));
        System.out.println(text.getText());

        String calculatedValue = text.getText();
        String expectedValue = "15";
        if (expectedValue.equals(calculatedValue)) {
            System.out.println("The test ran successfully, the answer is correct: " + calculatedValue);
        } else {
            System.out.println("The test has failed, the answer does not match the expected value. The expected value was " + expectedValue + ", but you've got " + calculatedValue);
        }

        System.out.println("Third task finished");

    }
    @After
    public void tearDown() {
        super.tearDown();
    }
}
