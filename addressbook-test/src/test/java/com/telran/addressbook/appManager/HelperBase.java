package com.telran.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.name;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver){
        this.driver=driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


    public void confirmAlert(){
        driver.switchTo().alert().accept();
    }

    public void type(By locator, String text) {
        if (text!=null){
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }

    }


    public void click(String s) {
        click(name(s));
    }

}




