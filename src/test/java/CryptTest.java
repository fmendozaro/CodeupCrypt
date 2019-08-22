import org.junit.Test;
import static org.junit.Assert.*;

public class CryptTest {
    @Test
    public void testHasPasswordAndHash(){
        CodeupCrypt crypt = new CodeupCrypt("strongPass");
        assertEquals(crypt.getPassword(), "strongPass");
        assertEquals(crypt.getHash(), "str0ngP4ss");
    }
}