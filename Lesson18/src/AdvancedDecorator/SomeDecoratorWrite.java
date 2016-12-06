package AdvancedDecorator;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by katerina on 12/5/16.
 */

public class SomeDecoratorWrite extends FilterOutputStream {
    private long writeBytes;

    private byte key = 'b';

    public SomeDecoratorWrite(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        int resultWrite = b;
        byte by = (byte) resultWrite;
        by ^= key;
        resultWrite = by & 0xFF;
        writeBytes++;
        out.write(resultWrite);
    }

    /*@Override
    public void write(byte[] b) throws IOException {
        writeBytes += b.length;
        out.write(b);
    }*/

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int i = off; i < len; i++) {
            b[i] ^= key;
        }
        writeBytes += len;
        out.write(b, off, len);
    }

    public long getWriteBytes() {
        return writeBytes;
    }
}
