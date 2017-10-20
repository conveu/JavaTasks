import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CryptTest {
    @Test
    public void cryptTest() throws IOException {

        byte[] original = {1,2,3,4,5};
        ByteArrayInputStream input = new ByteArrayInputStream(original);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Main.crypt(input,output);
        byte[] crypted = output.toByteArray();
        input.close();
        output.close();
        byte[] exepcted = {2,3,4,5,6};

        assertArrayEquals(exepcted,crypted);
    }

    @Test
    public void decryptTest() throws IOException {

        byte[] original = {2,3,4,5,6};
        ByteArrayInputStream input = new ByteArrayInputStream(original);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Main.decrypt(input,output);
        byte[] crypted = output.toByteArray();
        input.close();
        output.close();
        byte[] exepcted = {1,2,3,4,5};

        assertArrayEquals(exepcted,crypted);
    }
}
