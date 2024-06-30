import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {
    //    2*l*w + 2*w*h + 2*h*l
    public static void main(String[] args) {
        String[][] data = Input("2input");
//        System.out.println(Arrays.toString(data));
        System.out.println(solveCubeWrappers(data) + "\nsolved");
    }

    private static int solveCubeWrappers(String[][] data) {

        System.out.println("started execution");
        int totalInt = 0;
        for (String[] strArr : data) {
            System.out.println(Arrays.toString(strArr));
            int l, w, h;
            l = Integer.parseInt(strArr[0]);
            w = Integer.parseInt(strArr[1]);
            h = Integer.parseInt(strArr[2]);

            int total = (2 * l * w) + (2 * w * h) + (2 * h * l);
            int[] dim = new int[3];
            dim[0] = l * w;
            dim[1] = h * w;
            dim[2] = h * l;

            Arrays.sort(dim);
            System.out.println(dim[0]);
            System.out.println(total);

            total += dim[0];
            totalInt += total;
        }

        return totalInt;
    }

    private static String[][] Input(String path) {

        String[][] arr = new String[1000][3];
        int i = 0;
        try {
            File myObj = new File(path);
            System.out.println(myObj.length());
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine() && i < arr.length) {
                String data1 = myReader.nextLine();
                String[] strArray = data1.split("x");
//                System.out.println(Arrays.toString(strArray));
                arr[i] = strArray;
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return arr;
    }
}
