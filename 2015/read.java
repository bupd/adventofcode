import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static String Input() {
        StringBuilder data = new StringBuilder();

        try {
            File myObj = new File("1input");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data1 = myReader.nextLine();
                data.append(data1);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data.toString();
    }
}
