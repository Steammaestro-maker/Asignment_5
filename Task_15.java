import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] balls = new int[n];

        for (int i = 0; i < n; i++) {
            balls[i] = in.nextInt();
        }

        int length = n;
        int destroyed = 0;

        while (true) {
            boolean removed = false;

            for (int i = 0; i < length; ) {
                int j = i + 1;
                while (j < length && balls[j] == balls[i]) {
                    j++;
                }

                int runLength = j - i;
                if (runLength >= 3) {
                    destroyed += runLength;

                    for (int k = i; k < length - runLength; k++) {
                        balls[k] = balls[k + runLength];
                    }
                    length -= runLength;
                    removed = true;
                    break;
                }

                i = j;
            }

            if (!removed) {
                break;
            }
        }

        System.out.println(destroyed);
    }
}