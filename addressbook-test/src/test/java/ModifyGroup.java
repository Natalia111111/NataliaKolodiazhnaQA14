import com.telran.addressbook.model.GroupData;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ModifyGroup extends TestBase{
    @Test
    public void groupModificationTests(){
        appl.gotogrouppage();
        int before= appl.getGroupCount();
        appl.selectedGroup();
        appl.initModifyGroup();
        appl.Fillgroupform(new GroupData("1","1","1"));
        appl.submintGroupModification();
        appl.returnToGroupPage();
        int after=appl.getGroupCount();
        Assert.assertEquals(after, before);
    }
}
