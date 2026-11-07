import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int previous = 0;

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (i == 0 || value != previous) {
                count++;
            }
            previous = value;
        }

        System.out.println(count);
    }
}