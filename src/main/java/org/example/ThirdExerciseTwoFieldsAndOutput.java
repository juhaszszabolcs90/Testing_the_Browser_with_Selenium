package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ThirdExerciseTwoFieldsAndOutput extends NavigationTest{

    String numberInput1 = "100";
    String numberInput2 = "200";

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
        firstValueBox.sendKeys(numberInput1);

//      Second value
//    <input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement secondValueBox = driver.findElement(By.id("sum2"));
        secondValueBox.click();
        secondValueBox.sendKeys(numberInput2);

//        submit button
        //*[@id="gettotal"]/button
//        <button type="button" onclick="return total()" class="btn btn-default">Get Total</button>
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();

//        show result in span
//        <span id="displayvalue">15</span>
        //*[@id="displayvalue"]
        String calculatedValue = driver.findElement(By.id("displayvalue")).getText();
        System.out.println(calculatedValue);

        if (!isNumeric(calculatedValue)) {
            System.out.println("values given are not numbers");
        } else {
            if (this.isResultCorrect(calculatedValue)) {
                System.out.println("The test ran successfully, the answer is correct: " + calculatedValue);
            } else {
                System.out.println("The test has failed, the answer does not match the expected value. The expected value was " + calculateValue() + ", but you've got " + calculatedValue);
            }
        }

        System.out.println("Third task finished");

    }

    public String calculateValue() {
        int sum = Integer.parseInt(this.numberInput1) + Integer.parseInt(this.numberInput2);
        return Integer.toString(sum);
    }
    private boolean isResultCorrect(String calculatedValue) {
        int sum = Integer.parseInt(this.numberInput1) + Integer.parseInt(this.numberInput2);
        return sum == Integer.parseInt(calculatedValue);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        } else {
            try {
                int var1 = Integer.parseInt(strNum);
                return true;
            } catch (NumberFormatException var2) {
                return false;
            }
        }
    }
    @After
    public void tearDown() {
        super.tearDown();
    }
}
