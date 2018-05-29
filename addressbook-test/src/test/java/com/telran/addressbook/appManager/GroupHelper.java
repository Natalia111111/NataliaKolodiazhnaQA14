package com.telran.addressbook.appManager;

import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.name;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
      super(driver);


    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void SubmitGroupCreation() {
        click(locator());
    }

    public String locator() {
        return "submit";
    }

    public void Fillgroupform(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());

        type(By.name("group_header"), groupData.getHeader());

        type(By.name("group_footer"), groupData.getFooter());


    }


    public void initgroupcreation() {
        click("new");
    }

    public void selectedGroup() {
        click("Selected[]");
    }

    public void deleteGroup() {
        click("delete");
    }

    public int getGroupCount() {
        return driver.findElements(name("selected[]")).size();
    }

    public void initModifyGroup() {
        click(By.xpath("//*[@value='Edit group']"));
    }

    public void submintGroupModification() {
        click(By.cssSelector("[name=update]"));
    }

    public boolean isThereAGroup() {

        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        initgroupcreation();
        Fillgroupform(new GroupData()
                .withFooter("footer").withName("name").withHeader("header"));
        SubmitGroupCreation();
        returnToGroupPage();
    }


}
