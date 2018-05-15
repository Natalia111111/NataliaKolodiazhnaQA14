package com.telran.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManeger {
    private WebDriver driver;
    private String user;
    private String pwd;

    public void start() {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void SubmitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void Fillgroupform(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys (groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFoter());

    }

    public void initgroupcreation() {
      driver.findElement(By.name("new")).click();
    }

    public void gotogrouppage() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void Login(String user, String pwd) {

        driver.findElement(By.name("user")).click();
      driver.findElement(By.id("nav")).click();
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(user);
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(pwd);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void openadressbook(String url) {
      driver.get(url);
    }

    public void selectedGroup() {
        driver.findElement(By.name("Selected[]")).click();
    }

    public void stop() {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public void initModifyGroup() {
        driver.findElement(By.xpath("//*[@value='Edit group']")).click();
    }

    public void submintGroupModification() {
        driver.findElement(By.cssSelector("[name=update]")).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void initContactDeletion() {

    }

    public void selectContact() {

    }
}


