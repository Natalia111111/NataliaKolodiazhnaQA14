import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      driver = new ChromeDriver();
        openadressbook();
        Login();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void SubmitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void Fillgroupform(String name, String foter, String header) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(name);
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys (header);
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(foter);

    }

    public void initgroupcreation() {
      driver.findElement(By.name("new")).click();
    }

    public void gotogrouppage() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void Login() {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.id("nav")).click();
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys("admin");
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys("secret");
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void openadressbook() {
      driver.get("http://localhost/addressbook/");
    }

    public void selectedGroup() {
        driver.findElement(By.name("Selected[]")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();

    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }
}
