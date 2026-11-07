import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean found = false;

        if (n > 0) {
            int previous = in.nextInt();

            for (int i = 1; i < n; i++) {
                int current = in.nextInt();
                if ((previous > 0) == (current > 0)) {
                    found = true;
                }
                previous = current;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}