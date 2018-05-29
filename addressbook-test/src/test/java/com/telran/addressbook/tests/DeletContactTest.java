package com.telran.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletContactTest extends TestBase {

        @Test
        public void contactDeletionTest(){
            appl.getNavigationHelper().goToContactPage();
            if (!appl.getContactHelper().isThereContact()){
                appl.getContactHelper().CreationAddressNew();
            }
            int before= appl.getContactHelper().getContactCount();

            appl.getContactHelper().selectContact();
            appl.getContactHelper().deleteContact();
            appl.getContactHelper().returnContactPage();
            int after= appl.getContactHelper().getContactCount();
            Assert.assertEquals(after, before-1);

        }

}
