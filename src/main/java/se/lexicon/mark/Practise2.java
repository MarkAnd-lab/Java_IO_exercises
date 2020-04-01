package se.lexicon.mark;

// 2. Create a textfile (.txt) and fill it with lines of names.
// a. In Java create a method that read in the lines into a Collection of your choice using BufferedReader.
// One line for each element in the Collection.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Practise2 {
    public static void main(String[] args) {
        System.out.println("Example 2:");
        File javaNamn = new File("C://Downloads/JavaNamn.txt");
        for (String string : read(javaNamn)){
            System.out.println(string);
        }

    }

    public static List<String> read(File javaNamn) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(javaNamn))) {
            String line;
            while ((line = reader.readLine()) != null) {
    strings.add(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
