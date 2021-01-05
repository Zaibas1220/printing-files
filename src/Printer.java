import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private File file;

    public Printer (String fileName){
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String contain) throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            if (line.contains(contain)){
                System.out.println(line);
            }
        }
    }
}
