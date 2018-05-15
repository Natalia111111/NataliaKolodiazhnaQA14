import org.junit.Assert;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {
   @Test
    public void groupDeletionTest(){
      int before= appl.getGroupCount();
    appl.gotogrouppage();
      appl.selectedGroup();
      appl.deleteGroup();
     appl.returnToGroupPage();
      int after= appl.getGroupCount();
       Assert.assertEquals(after, before-1);

    }



}
