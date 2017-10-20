import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamInd extends InputStream {
    private InputStream is;

    public StreamInd(InputStream is) throws IOException {
        this.is=is;
    }

    public int read() throws IOException {
        int shifr = is.read();
        if(shifr!=-1)
            return shifr-1;
        else
            return -1;
    }
}

