import org.testng.annotations.Test;

public class DeletContactTest extends TestBase {
    //  @Test
    // public void contactDeletionTest(){
    //  appl.selectContact();
    //   appl.deleteContact();
    //  appl.confirmAlert();
//}
        @Test
        public void contactDeletionTest(){
        appl.selectContact();
        appl.initContactDeletion();
        appl.acceptAlert();

    }

}
