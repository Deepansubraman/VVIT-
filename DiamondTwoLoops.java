public class DiamondTwoLoops {
    public static void main(String[] args) {
        int n = 5; 
        int mid = n / 2; 

        for (int i = 0; i < n; i++) {
            int row = i <= mid ? i : n - i - 1;
            int spaces = mid - row;
            int stars = 2 * row + 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
