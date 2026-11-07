import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt() - 1;
        int d = in.nextInt() - 1;

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = i + 1;
        }

        reverse(sequence, a, b);
        reverse(sequence, c, d);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) result.append(' ');
            result.append(sequence[i]);
        }

        System.out.println(result);
    }

    private static void reverse(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}