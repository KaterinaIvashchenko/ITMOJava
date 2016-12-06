package Decorator;

import java.io.*;

/**
 * Created by katerina on 12/5/16.
 */

public class SomeSimpleDecWrite extends FilterOutputStream {
    private long writeBytes;
    //XOR с каждым элементом (см. лекцию по потокам)
    //InputStream in = new DecStream (new File Input Stream(file));
    //x = .read();
    private byte key = 10;

    public SomeSimpleDecWrite(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        writeBytes++;
        out.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        writeBytes += b.length;
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        writeBytes += len;
        out.write(b, off, len);
    }

    public long getWriteBytes() {
        return writeBytes;
    }
}
