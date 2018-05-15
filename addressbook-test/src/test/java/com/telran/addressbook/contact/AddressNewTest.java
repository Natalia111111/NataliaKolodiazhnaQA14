package com.telran.addressbook.contact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddressNewTest extends ContactTest {
    @Test
    public void testContact1() {
        app.gotoAddressbook();
        app.Login("admin", "secret");
        int before= app.getAddressContact();
        app.CreationAddressNew());

        app.CreationFirstName("firstname", contactData.getFirstName());

        app.CreationLastName("lastname", contactData.getLastName());

        app.CreationAddress("address", contactData.getAddress());

        app.CreationTelefone("home", contactData.getTelefon());

        app.choiceGroup();

        app.getClick(contactData.getHome());
        int after= app.getAddressContact();
        Assert.assertEquals(after, before+1);
    }

    @Test
    public void testContact2(ContactData contactData) throws Exception {
        app.gotoAddressbook();
        app.Login(contactData.getLogin());
        app.CreationAddressNew(By.linkText(contactData.getAddNew()));

        app.CreationFirstName("firstname", contactData.getFirstName());

        app.CreationLastName("lastname", contactData.getLastName());

        app.CreationAddress("address", contactData.getAddress());

        app.CreationTelefone("home", contactData.getTelefon());

        app.choiceGroup();

        app.getClick(contactData.getHome());
    }
    @Test
    public void testContact3(ContactData contactData) throws Exception {
        app.gotoAddressbook();
        app.Login(contactData.getLogin());
        app.CreationAddressNew(By.linkText(contactData.getAddNew()));

        app.CreationFirstName("firstname", contactData.getFirstName());

        app.CreationLastName("lastname", contactData.getLastName());

        app.CreationAddress("address", contactData.getAddress());

        app.CreationTelefone("home", contactData.getTelefon());

        app.choiceGroup();

        app.getClick(contactData.getHome());
    }
}
