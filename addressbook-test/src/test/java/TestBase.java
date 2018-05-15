import com.telran.addressbook.model.ApplicationManeger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManeger appl = new ApplicationManeger();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        appl.start();
        appl.openadressbook("http://localhost/addressbook/");
        appl.Login("secret", "user");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        appl.stop();

    }

}
