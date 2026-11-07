import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        int petyaHeight = in.nextInt();
        int position = 1;

        for (int height : heights) {
            if (height >= petyaHeight) {
                position++;
            }
        }

        System.out.println(position);
    }
}