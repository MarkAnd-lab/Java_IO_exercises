package se.lexicon.mark.main;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(new Car("ABC123", "Volvo", "S60", LocalDate.parse("2010-03-25" )),
                new Car("DEF456", "BMW", "530", LocalDate.parse("2007-10-13" ))
        );
        String path = "C://Downloads/Cars.txt";
        File cars = new File("C://Downloads/Cars.txt" );
        serialize(carList, path);

        deserialize(cars);
    }


      public static List<Car> serialize(List<Car> source, String filePath) {
          try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
               ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)

          ) {
              out.writeObject(source);

          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
          return source;
      }


      public static void deserialize(File source) {


          try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(source))
          ) {
              List<Car> deserialized = (List<Car>) in.readObject();
              for (Car car : deserialized){
                  System.out.println(car.getCarID());
                  System.out.println(car.getBrand());
                  System.out.println(car.getModel());
                  System.out.println(car.getRegNumber());
                  System.out.println(car.getRegDate());
                  }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }


      }
}
