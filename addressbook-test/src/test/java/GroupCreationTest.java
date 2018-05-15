


import com.telran.addressbook.model.GroupData;
import org.junit.Assert;
import org.testng.annotations.*;


public class GroupCreationTest extends TestBase{




  @Test (priority=1)
  public void testGroupCreationLongname() throws Exception {

    int before= appl.getGroupCount();



    appl.gotogrouppage();
    appl.initgroupcreation();
    appl.Fillgroupform(new GroupData("name", "foter", "header"));
    appl.SubmitGroupCreation();
    appl.returnToGroupPage();
    int after= appl.getGroupCount();

    //system.out.println("testCreateGroupLongName() pased");
    Assert.assertEquals(after,before+1);
  }
  @Test
  public void testGroupCreationShortname() throws Exception {

    appl.gotogrouppage();
    appl.initgroupcreation();
    appl.Fillgroupform(new GroupData("n", "f", "h"));
    appl.SubmitGroupCreation();
    appl.returnToGroupPage();
  }
  @Test
  public void testGroupCreation() throws Exception {

    appl.gotogrouppage();
    appl.initgroupcreation();
    appl.Fillgroupform(new GroupData("name", "foter", "header"));
    appl.SubmitGroupCreation();
    appl.returnToGroupPage();
  }



}
