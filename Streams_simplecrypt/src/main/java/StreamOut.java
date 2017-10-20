import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamOut extends OutputStream {
    private OutputStream os;

    public StreamOut(OutputStream os) throws IOException {
        this.os=os;
    }

    public void write(int b) throws IOException {
        os.write(b+1);
    }
}
