package AdvancedDecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 */

public class SomeDecoratorRead extends FilterInputStream {

    private byte key = 'b';

    private long readBytes;

    protected SomeDecoratorRead(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int resultRead = super.read();
        if (resultRead > 0)
            readBytes++;
        byte b = (byte) resultRead;
        b ^= key;
        resultRead = b & 0xFF;
        return resultRead;
    }

    /*@Override
    public int read(byte[] br) throws IOException {
        int read = super.read();
        if (read > 0)
            readBytes += read;
        return read;
    }*/

    @Override
    public int read(byte[] br, int off, int len) throws IOException {
        int read = super.read(br, off, len);
        if (read > 0)
            readBytes += read;
        for (int i = off; i < read; i++) {
            br[i] ^= key;
        }
        return read;
    }

    public long getReadBytes() { return readBytes;}
}
