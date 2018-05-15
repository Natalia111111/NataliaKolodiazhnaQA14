package com.telran.addressbook.contact;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ApplicationContacts {
    private WebDriver driver;

    public void Start() {
      driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void getClick(String s) {
      driver.findElement(By.xpath(s)).click();
    }

    public void choiceGroup() {
      driver.findElement(By.name("new_group")).click();
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("QA14");
      driver.findElement(By.name("new_group")).click();
    }

    public void CreationTelefone(String home, String s) {
      driver.findElement(By.name(home)).click();
      driver.findElement(By.name(home)).clear();
      driver.findElement(By.name(home)).sendKeys(s);
    }

    public void CreationAddress(String address, String poltava) {
      driver.findElement(By.name(address)).click();
      driver.findElement(By.name(address)).clear();
      driver.findElement(By.name(address)).sendKeys(poltava);
    }

    public void CreationLastName(String lastname, String vadim) {
      driver.findElement(By.name(lastname)).click();
      driver.findElement(By.name(lastname)).clear();
      driver.findElement(By.name(lastname)).sendKeys(vadim);
    }

    public void CreationFirstName(String firstname, String kulinich) {
      driver.findElement(By.name(firstname)).click();
      driver.findElement(By.name(firstname)).clear();
      driver.findElement(By.name(firstname)).sendKeys(kulinich);
    }

    public void CreationAddressNew(By add_new) {
      driver.findElement(add_new).click();
    }

    public void Login(String s) {
      driver.findElement(By.xpath(s)).click();
    }

    public void gotoAddressbook() {
      driver.get("http://localhost/addressbook/");
    }

    public void Stop() {
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

    public int getAddressContact() {
        return driver.findElements(By.name("selected[]")).size();
    }
}
