package com.telran.addressbook.tests;


import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import  org.testng.Assert;
import org.testng.annotations.*;


public class GroupCreationTest extends TestBase{




  @Test (priority=2)
  public void testGroupCreationLongname(){
    appl.getNavigationHelper().gotogrouppage();
    int before= appl.getGroupHelper().getGroupCount();
    appl.getGroupHelper().initgroupcreation();
    appl.getGroupHelper().Fillgroupform(new GroupData());
    appl.getGroupHelper().SubmitGroupCreation();
    appl.getGroupHelper().returnToGroupPage();
    int after= appl.getGroupHelper().getGroupCount();
    //system.out.println("testCreateGroupLongName() pased");
    Assert.assertEquals(after, before+1);
  }

  @Test  (priority = 1)
  public void testGroupCreationShortname(){

    appl.getNavigationHelper().gotogrouppage();
    int before = appl.getGroupHelper().getGroupCount();
    appl.getGroupHelper().initgroupcreation();
    appl.getGroupHelper().Fillgroupform(new GroupData()
            .withName("OnlyName"));
    appl.getGroupHelper().SubmitGroupCreation();
    appl.getGroupHelper().returnToGroupPage();
    int after = appl.getGroupHelper().getGroupCount();
    // System.out.println("testCreateGroupLongName() passed");
    Assert.assertEquals(after, before+1);
  }

  @Test (priority = 3)
  public void testGroupCreation()  {
    appl.getNavigationHelper().gotogrouppage();
    int before = appl.getGroupHelper().getGroupCount();
       appl.getGroupHelper().initgroupcreation();
    appl.getGroupHelper().Fillgroupform(new GroupData()
            .withName("g")
            .withHeader("nat")
            .withFooter("hjj"));


    appl.getGroupHelper().SubmitGroupCreation();
    appl.getGroupHelper().returnToGroupPage();
    int after = appl.getGroupHelper().getGroupCount();
    System.out.println("testCreateGroupShortName() passed");
    Assert.assertEquals(after, before+1);
  }



}
