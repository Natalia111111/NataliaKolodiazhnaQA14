package com.telran.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {



    public NavigationHelper(WebDriver driver) {
        super (driver);
    }
    public void gotogrouppage() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Group")&& isElementPresent(By.name("new"))){
            return;
        }
      click(By.linkText("groups"));
    }
    public void goToContactPage() {
        driver.findElement(By.xpath("//*[contains(text(),'home')]")).click();

    }
}

