import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HamcrestStringContains {
@Test
    public void stringContainsString()
    {
        assertThat("ajayaglave29599@gmail.com",containsString("gmail.com"));
    }

    @Test
    public void testendsWith(){
    assertThat("ajay.aglave@collabera.com",endsWith(".com"));
    }

    @Test
    public void testStartWith(){
        assertThat("ajay.aglave@collabera.com",startsWith("ajay"));
    }




}
