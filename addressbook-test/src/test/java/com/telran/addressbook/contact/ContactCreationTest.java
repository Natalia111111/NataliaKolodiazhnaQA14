package com.telran.addressbook.contact;

import com.telran.addressbook.tests.TestBase;
import org.testng.annotations.Test;
import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
public class ContactCreationTest extends TestBase {

    @Test
    public void ContactCreationTest() {
        appl.getContactHelper().initContactCreation();
        appl.getContactHelper().fillContactForm(new ContactData().setFname("Masha")
                .setLName("Sor")
                .setAdd("ghh").setTel("025"));

        appl.getNavigationHelper().goToContactPage();
        int before = appl.getContactHelper().getContactCount();
        appl.getContactHelper().initContactCreation();

        appl.getContactHelper().submitContactCreation();
        appl.getContactHelper().returnContactPage();
        int after = appl.getContactHelper().getContactCount();
        // System.out.println("testCreateGroupLongName() passed");
        Assert.assertEquals(after, before+1);
    }

}