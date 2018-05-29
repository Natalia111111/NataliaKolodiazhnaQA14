package com.telran.addressbook.tests;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyContact extends  TestBase {
    @Test
    public void ContactCreationTest() {
        appl.getNavigationHelper().goToContactPage();
        appl.getContactHelper().fillContactForm(new ContactData());
               int before = appl.getContactHelper().getContactCount();
        appl.getContactHelper().initContactCreation();

        appl.getContactHelper().submitContactModification();
        appl.getContactHelper().returnContactPage();
        int after = appl.getContactHelper().getContactCount();
        // System.out.println("testCreateGroupLongName() passed");
        Assert.assertEquals(after, before);
    }
}
