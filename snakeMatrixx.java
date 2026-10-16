import java.util.Scanner;

public class snakeMatrixx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Snake Pattern:");

        for (int i = 0; i < rows; i++) {

            // Even row -> Left to Right
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            // Odd row -> Right to Left
            else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}