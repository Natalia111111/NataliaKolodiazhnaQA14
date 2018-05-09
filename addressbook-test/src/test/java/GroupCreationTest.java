


import org.testng.annotations.*;


public class GroupCreationTest extends TestBase{


  @Test (priority=1)
  public void testGroupCreationLongname() throws Exception {

    gotogrouppage();
    initgroupcreation();
    Fillgroupform("name", "foter", "header");
    SubmitGroupCreation();
    returnToGroupPage();
    System.out.println("GroupCreationTest() passed");
  }
  @Test
  public void testGroupCreationShortname() throws Exception {

    gotogrouppage();
    initgroupcreation();
    Fillgroupform("n", "f", "h");
    SubmitGroupCreation();
    returnToGroupPage();
  }
  @Test
  public void testGroupCreation() throws Exception {

    gotogrouppage();
    initgroupcreation();
    Fillgroupform("name", "foter", "header");
    SubmitGroupCreation();
    returnToGroupPage();
  }



}
