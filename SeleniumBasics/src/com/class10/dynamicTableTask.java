package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class dynamicTableTask extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
        setUpDriver("chrome", url);

        // login to the application
        sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
        sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
        driver.findElement(By.cssSelector("input[value='Login']")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
        String expectedValue = "Susan McLaren";

        for (int i = 1; i <= rows.size(); i++) {
            String rowText = "";
            try {
                rowText = driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[" + i + "]"))
                        .getText();
            } catch (Exception e) {
                System.out.println("buraya geldi 1");
            }

            if (rowText.contains(expectedValue)) {
                try {
                    driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[" + i + "]/td[13]")).click();
                    break;
                } catch (Exception e) {
                    System.out.println("buraya geldi 2");
                }
//                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_txtName\']")).clear();
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_txtName\']")).sendKeys("Susan Sarandon");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}