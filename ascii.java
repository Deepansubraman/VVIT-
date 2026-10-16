import java.util.Scanner;
public class ascii {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;}
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }}
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine(); // spy helllo bat
        String[] words = str.split(" ");// ["spy","hello","bat"];
        StringBuilder result = new StringBuilder();
        for (String word : words) {//word=spy;
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                int a= (int)word.charAt(i);
                sum+=a;
            }
            if (isPrime(word.length()) && isPrime(sum)) {
                result.append(word);
            }
        }
        if (result.length() == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println(result);
        }

      
    }
}
