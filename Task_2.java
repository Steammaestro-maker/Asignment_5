import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (value % 2 == 0) {
                if (result.length() > 0) result.append(' ');
                result.append(value);
            }
        }

        System.out.println(result);
    }
}