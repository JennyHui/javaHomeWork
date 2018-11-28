import Spring.DiDemo2.CDPlayerConfig;
import Spring.DiDemo2.CDPlayerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class ConfigTest {

    @Autowired
    private CDPlayerImpl cdPlayer;

    @Test
    public void testConfig(){
        assertNotNull(cdPlayer);
    }
}
