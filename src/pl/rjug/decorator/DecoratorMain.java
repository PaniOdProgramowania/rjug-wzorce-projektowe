package pl.rjug.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DecoratorMain {

    public static final String FILE_PATH = "file/very_long_file.txt";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try (BufferedReader reader = new BufferedReader(
                    new FileReader(
                            FILE_PATH
                    ))) {
//            try (FileReader reader = new FileReader(FILE_PATH)) {
                int ch;
                StringBuilder stringBuilder = new StringBuilder();
                long startTime = System.nanoTime();
                while ((ch = reader.read()) != -1) {
                    stringBuilder.append((char) ch);
                }
                long endTime = System.nanoTime();
                System.out.println(endTime - startTime);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
