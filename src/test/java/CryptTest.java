import org.junit.Test;
import static org.junit.Assert.*;

public class CryptTest {
    @Test
    public void testHash(){
        assertEquals(CodeupCrypt.hashPassword("strongPass"), "str0ngP4ss");
    }
}