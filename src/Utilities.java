import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Utilities {

    String line;

    public void myInputScanner() {
        System.out.println( "Please input your data: " );
        System.out.println("For exit press: q");
        Scanner scanner = new Scanner( System.in );
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals( "q" )) {
                break;
            }
            line = line  + " " + currentLine;
        }
        scanner.close();
    }

    public void readFromScanner() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines( Paths.get( "C:\\file.txt" ) );
        } catch (IOException e) {
            System.out.println(e.getMessage() + " was created ?");
        }
        lines.add( line );
        try {
            Files.write( Paths.get( "C:\\file.txt" ), lines);
        } catch (IOException e) {
            System.out.println(e.getMessage() + " are the correct file and path ?");
        }
    }

}


