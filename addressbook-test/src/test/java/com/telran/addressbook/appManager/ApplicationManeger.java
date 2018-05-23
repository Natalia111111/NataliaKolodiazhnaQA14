package com.telran.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManeger {
    private  NavigationHelper navigationHelper ;
    private WebDriver driver;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private String browser;

    public ApplicationManeger(String browser) {

        this.browser = browser;
    }


    public void start() {

        if(browser.equals(BrowserType.CHROME)){
            driver= new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            driver= new FirefoxDriver();
        }else  if(browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        groupHelper=new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper= new ContactHelper(driver);
        openadressbook("http://localhost/addressbook/");
        Login("admin", "secret");
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

    public void stop() { driver.quit();
    }





    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;}

    public ContactHelper getContactHelper() {
        return contactHelper;}
}



