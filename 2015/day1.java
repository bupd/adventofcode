import java.util.HashMap;

public class day1 {
    public static void main(String[] args) {
        String data = read.Input();
        System.out.println(data);
        System.out.println(sovleParantheses(data) + "\nsolved");
    }

    private static String sovleParantheses(String s) {
        String output = new String();
        char[] ch = new char[s.length()];

        int floor = 0;

        // convert string to char array.
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        System.out.println(s.length());

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                floor++;
            } else {
                floor--;
            }

            if (floor == -1) {
                System.out.println(floor);
                return String.valueOf(i+1); // add 1 because question was 1 based index.
            }
        }


        return String.valueOf(floor);
    }
}
