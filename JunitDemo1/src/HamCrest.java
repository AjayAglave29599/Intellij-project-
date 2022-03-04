import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class HamCrest {

    @Test
    public void testEmailID(){  // JUnit Test case
        String email="ajay.aglave@collabera.com";
        Assert.assertTrue(email.contains("@"));
    }
    @Test
    public void testEmailIDHamcrest(){  // Hamcrest Test case
        String email="ajay.aglave@collabera.com";
        Assert.assertThat(email, StringContains.containsString("ajay"));
    }

}
