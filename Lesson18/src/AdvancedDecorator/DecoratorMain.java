package AdvancedDecorator;

import java.io.*;

/**
 * Created by katerina on 12/5/16.
 */

public class DecoratorMain {
    public static void main(String[] args) throws IOException {

        String fileName = "/Users/katerina/.../wp_cut.txt";

        InputStream in = new FileInputStream(fileName);

        SomeDecoratorWrite superOut = new SomeDecoratorWrite(new FileOutputStream(fileName + ".crypted"));

        while(true) {
            int b = in.read();

            if (b == -1)
                break;

            superOut.write(b);
        }

        SomeDecoratorRead superIn = new SomeDecoratorRead(new FileInputStream(fileName + ".crypted"));

        OutputStream out = new FileOutputStream(fileName + ".decrypted");

        while(true) {
            int b = superIn.read();

            if (b == -1)
                break;

            out.write(b);
        }

        out.close();
        in.close();
        superOut.close();
        superIn.close();
    }
}

