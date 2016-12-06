package Decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by katerina on 12/5/16. rec12.
 */

public class SomeSimpleDecRead extends FilterInputStream {

    private long readBytes;

    protected SomeSimpleDecRead(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int resultRead = super.read();
        if (resultRead > 0)
            readBytes++;
        return resultRead;
    }

    @Override
    public int read(byte[] br) throws IOException {
        int read = super.read();
        if (read > 0)
            readBytes += read;
        return read;
    }

    @Override
    public int read(byte[] br, int off, int len) throws IOException {
        int read = super.read(br, off, len);
        if (read > 0)
            readBytes += read;
        return read;
    }

    public long getReadBytes() { return readBytes;}
}
