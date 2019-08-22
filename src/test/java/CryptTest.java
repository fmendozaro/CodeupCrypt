import org.junit.Test;
import static org.junit.Assert.*;

public class CryptTest {

    @Test
    public void testHash(){
        assertEquals(CodeupCrypt.hashPassword("strongPass"), "str0ngP4ss");
        assertEquals(CodeupCrypt.hashPassword("leElooDallas"), "l33l00D4ll4s");
        assertEquals(CodeupCrypt.hashPassword("123"), "123");
    }

    @Test
    public void testCheckPassword(){
        assertTrue("password matches", CodeupCrypt.checkPassword("strongPass", "str0ngP4ss"));
    }

}