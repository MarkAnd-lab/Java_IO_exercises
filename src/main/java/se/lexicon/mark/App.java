package se.lexicon.mark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1.	Create a textfile (.txt) and fill it with some text content.
 * a.	In Java create a method that read in a String from file and return the String using FileReader.
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Example 1: ");

        File JavaTest = new File("C://Downloads/JavaTest.txt");
        String s = read(JavaTest);
        System.out.println(s);
    }

    private static String read(File JavaTest) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(JavaTest)) {
            int i;
            while ((i = reader.read()) != -1) {
                char letter = (char) i;
                stringBuilder.append(letter);

            }
        }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
         catch (IOException e) {
            e.printStackTrace();
        }

         return stringBuilder.toString();
    }

}
