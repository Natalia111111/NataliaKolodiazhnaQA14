package com.telran.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {
   @Test
    public void groupDeletionTest(){
       appl.getNavigationHelper().gotogrouppage();
       if (!appl.getGroupHelper().isThereAGroup()){
           appl.getGroupHelper().createGroup();
       }
      int before= appl.getGroupHelper().getGroupCount();

      appl.getGroupHelper().selectedGroup();
      appl.getGroupHelper().deleteGroup();
     appl.getGroupHelper().returnToGroupPage();
      int after= appl.getGroupHelper().getGroupCount();
     Assert.assertEquals(after, before-1);

    }



}
