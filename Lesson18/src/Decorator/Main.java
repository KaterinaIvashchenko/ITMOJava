package Decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by katerina on 12/5/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "/Users/katerina/.../wp.txt";

        FileInputStream fIn = new FileInputStream(fileName);
        FileOutputStream fout = new FileOutputStream(fileName + ".katya");

        SomeSimpleDecRead countIn = new SomeSimpleDecRead(fIn);
        SomeSimpleDecWrite countOut = new SomeSimpleDecWrite(fout);

        while(true) {
            int b = countIn.read();

            if (b == -1)
                break;

            countOut.write(b);

        }

        System.out.println(countIn.getReadBytes());
        System.out.println(countOut.getWriteBytes());


    }
}
