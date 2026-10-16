import java.util.Scanner;
public class vowel {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        String str = sc.nextLine();//greiay
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int minCost = Integer.MAX_VALUE;//1287042
       
        for (char target : vowels) {
             int cost = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (isVowel(ch)) {
                    cost += Math.abs(ch - target);
                } else {
                    cost += 10;
                }
            }

            minCost = Math.min(minCost, cost);
            //micost=Math.min(1288512,42);  
        }

        System.out.println(minCost);
        sc.close();
    }
}
