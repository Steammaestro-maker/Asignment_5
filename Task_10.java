import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int max = in.nextInt();
        for (int i = 1; i < n; i++) {
            int value = in.nextInt();
            if (value > max) {
                max = value;
            }
        }

        System.out.println(max);
    }
}