package pl.rjug;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DecoratorMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int nrOfChars = 51490;
            char[] result = new char[nrOfChars];
            try {
//            FileReader bufferedReader = new FileReader("file/very_long_file.txt");
                BufferedReader bufferedReader = new BufferedReader(new FileReader("file/very_long_file.txt"));
                long startTime = System.nanoTime();
                int nrOfCharsRead = bufferedReader.read(result, 0, nrOfChars);
                long endTime = System.nanoTime();
                System.out.println("Przeczytano: " + nrOfCharsRead);
                System.out.println(endTime - startTime);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
