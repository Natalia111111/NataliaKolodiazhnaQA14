package com.telran.addressbook.tests;

import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyGroup extends TestBase{
    @Test
    public void groupModificationTests(){
        appl.getNavigationHelper().gotogrouppage();
        int before= appl.getGroupHelper().getGroupCount();
        appl.getGroupHelper().selectedGroup();
        appl.getGroupHelper().initModifyGroup();
        appl.getGroupHelper().Fillgroupform(new GroupData());
        appl.getGroupHelper().submintGroupModification();
        appl.getGroupHelper().returnToGroupPage();
        int after= appl.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }
}
