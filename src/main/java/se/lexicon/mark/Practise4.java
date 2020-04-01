package se.lexicon.mark;

// 4.Create a method that can copy a file using both BufferedInputStream and BufferedOutputStream.

import java.io.*;

public class Practise4 {
    public static void main(String[] args) {
        File blogodesign = new File("C://Downloads/Blogodesign.png");
        File blogodesign_copy = new File("C://Downloads/Blogodesign_copy.png");
        copy(blogodesign,blogodesign_copy);
        //System.out.println(blogodesign);
    }

    private static void copy(File blogodesign, File blogodesign_copy) {
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(blogodesign)); //Wrapping the lower level streams
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(blogodesign_copy));
                ) {
            byte[] buffer = new byte[1024]; //Defining a buffer
            int byteRead; //Number of bytes that were read AND how many bytes that were read into the buffer array
            while ((byteRead = in.read(buffer)) > 0){
                out.write(buffer, 0, byteRead);
                out.flush(); //Forcing a write after each iteration
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
