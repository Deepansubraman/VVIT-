
import java.util.Scanner;

public class Trouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int start = -1;
        int end = -1;
        int maxLength = 0;

        int left = 0;
        int right = 0;

        while (right < n) {
            if (str.charAt(right) == 'm') {
                right++;
            } else {
                int length = right - left;

                if (length > maxLength) {
                    maxLength = length;
                    start = left;
                    end = right - 1;
                }

                left = right + 1;
                right++;
            }
        }

        // Handle a sequence that reaches the end of the string
        int length = right - left;

        if (length > maxLength) {
            maxLength = length;
            start = left;
            end = right - 1;
        }

        System.out.println(start + " " + end);
        sc.close();
    }
}
