package pl.rjug;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DecoratorMain {

    public static void main(String[] args) {
        char[] result = new char[Integer.MAX_VALUE];
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file/very_long_file.txt"));
            long startTime = System.nanoTime();
            int nrOfCharsRead = bufferedReader.read(result, 0, Integer.MAX_VALUE);
            long endTime = System.nanoTime();
            System.out.println("Przeczytano: " + nrOfCharsRead);
            System.out.println(endTime - startTime);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
