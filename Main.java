import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix 1 dimensions
        System.out.print("Enter rows of Matrix 1: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of Matrix 1: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Matrix 2 dimensions
        System.out.print("Enter rows of Matrix 2: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of Matrix 2: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // ---------------- ADDITION ----------------
        if (r1 == r2 && c1 == c2) {

            int[][] add = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    add[i][j] = A[i][j] + B[i][j];
                }
            }

            System.out.println("\nAddition:");
            printMatrix(add);

            // ---------------- SUBTRACTION ----------------
            int[][] sub = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sub[i][j] = A[i][j] - B[i][j];
                }
            }

            System.out.println("\nSubtraction:");
            printMatrix(sub);

        } else {
            System.out.println("\nAddition and Subtraction not possible.");
        }

        // ---------------- MULTIPLICATION ----------------
        if (c1 == r2) {

            int[][] mul = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("\nMultiplication:");
            printMatrix(mul);

        } else {
            System.out.println("\nMultiplication not possible.");
            System.out.println("Condition: Columns of Matrix 1 must equal Rows of Matrix 2.");
        }

        sc.close();
    }

    // Method to print matrix
    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}