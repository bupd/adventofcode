import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {
    //    2*l*w + 2*w*h + 2*h*l
    public static void main(String[] args) {
        ArrayList data = Input("2input");
        System.out.println(data);
//        System.out.println(solveCube(data) + "\nsolved");
    }

    private static String solveCube(String s) {

        return "";
    }

    private static ArrayList<String[]> Input(String path) {
        ArrayList<String[]> arr = new ArrayList<>();

        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data1 = myReader.nextLine();
                String[] strArray = data1.split("x");
                System.out.println(Arrays.toString(strArray));
                arr.add(strArray);
                System.out.println(Arrays.toString(arr));
                arr.add(strArray);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return arr;
    }

}
