import org.testng.annotations.Test;

import java.util.Arrays;

public class Tests {
    @Test
    public static void firstTask () {
        int array[] = {1, 2, 3, 4, 5};
        int size = array.length;
        for (int i = size; i > 3; i--) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static boolean parsing(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check < 0) {
                return false;
            }
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(")) {
                check++;
                continue;
            }
            if (symbol.equals(")"))
                check--;
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public static void secondTask() {
        String s = "(This is (test )task)";
        System.out.println(parsing(s));
    }
}

