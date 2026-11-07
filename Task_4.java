import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        if (n > 0) {
            int previous = in.nextInt();

            for (int i = 1; i < n; i++) {
                int current = in.nextInt();
                if (current > previous) {
                    count++;
                }
                previous = current;
            }
        }

        System.out.println(count);
    }
}