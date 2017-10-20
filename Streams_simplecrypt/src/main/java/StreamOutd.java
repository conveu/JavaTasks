import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamOutd extends OutputStream {
    private OutputStream os;

    public StreamOutd(OutputStream os) throws IOException {
        this.os=os;
    }

    public void write(int b) throws IOException {
        os.write(b-1);
    }
}
