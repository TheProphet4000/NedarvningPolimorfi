import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 10/11/2020
 * Vidreskrevet af Mikkel Andreasen
 */

public class DataFile {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");

        DataFile p = new DataFile();
        p.save();
        p.load();
    }

//Start
    public void save() throws FileNotFoundException {

        java.io.File file = new java.io.File("data/varer.txt"); //hendviser til en TXT fil, der gemmer programmet.
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("Agurker ");
        output.println(10);
        output.print("Æbler ");
        output.println(85);

        // Close the file
        output.close();
    }
    //slut

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/varer.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String vare = input.next();
            int antal = input.nextInt();
            System.out.println(
                    vare + " " + antal);
        }

        // Close the file
        input.close();
    }
}