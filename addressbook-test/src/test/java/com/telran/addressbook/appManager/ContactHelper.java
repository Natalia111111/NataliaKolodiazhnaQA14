package com.telran.addressbook.appManager;

import com.telran.addressbook.model.ContactData;
import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.name;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }




    public void CreationAddressNew() {

        initContactCreation();
        fillContactForm(new ContactData());
        submitContactCreation();
        returnContactPage();
    }





    public void initContactCreation() {
        driver.findElement(By.xpath("//*[contains(text(),'add new')]"));

    }



    public void returnContactPage() {
        driver.findElement(By.linkText("\"//*[contains(text(),'home')]\")")).click();
    }

    public void submitContactCreation() {
        driver.findElement(name("submit")).click();
    }

    public void fillContactForm(ContactData contactData){
        typeC(By.name("firstname"), contactData.getFname());

        typeC(By.name("lastname"), contactData.getLName());


        driver.findElement(By.name("new_group")).click();
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("QA14");
        driver.findElement(By.name("new_group")).click();

        typeC(By.name("home"), contactData.getTel());

        typeC(By.name("address"), contactData.getAdd());
    }

    public void typeC(By locatorcont, String textContact) {
        driver.findElement(locatorcont).click();
        driver.findElement(locatorcont).clear();
        driver.findElement(locatorcont).sendKeys(textContact);
    }

    public void confirmAlert() {
        driver.switchTo().alert().accept();

    }

    public int getContactCount() {
        return driver.findElements(name("selected[]")).size();
    }
    public boolean isThereContact() {

        return isElementPresent(By.name("selected[]"));
    }



    public void submitContactModification() {
        driver.findElement(By.cssSelector("[name=update]")).click();
    }

    public void deleteContact() {
        click(By.xpath("//*[@value='Delete']"));


    }

    public void initContactDeletion() {

    }

    public void selectContact() {
        click (By.name("selected[]"));


    }
}

