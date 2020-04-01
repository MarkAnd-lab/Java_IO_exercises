package se.lexicon.mark;

//3. In Java create a Collection that contains at least five String objects.
//a. Then create a method that write each String object from the collection into a textfile.

import java.io.*;
import java.util.*;

public class Practise3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList (
           "Marek", "Robin", "Simon", "Fredrik", "Adam"
        );
        Collections.sort(names);
        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            File javaWrite = new File("C://Downloads/JavaWrite.txt");
            write(javaWrite, names);
        }
    }

    private static List<String> write(File javaWrite, List<String> names) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(javaWrite))){
            for (String toWrite : names) {
                writer.write(toWrite);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}
