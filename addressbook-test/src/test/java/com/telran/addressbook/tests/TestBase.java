package com.telran.addressbook.tests;

import com.telran.addressbook.appManager.ApplicationManeger;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class TestBase {

    protected final ApplicationManeger appl = new ApplicationManeger(BrowserType.CHROME);

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        appl.start();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        appl.stop();

    }

}
