package com.telran.addressbook.contact;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactTest {

  protected final ApplicationContacts app = new ApplicationContacts();

  @BeforeClass(alwaysRun = true)
  public void setUp()  {
      app.Start();
  }

  @Test
  public void testContact(ContactData contactData) throws Exception {
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


  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    app.Stop();

  }

}

