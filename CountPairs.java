import java.util.*;

public class CountPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int k = sc.nextInt();
        int count = 0;

        HashSet<Integer> set = new HashSet<>(arr);

        for (int i = 0; i < n; i++) {
            int target = arr.get(i)-k;
            if (set.contains(target)) {
                System.out.println(arr.get(i) + " " + target);
                count++;
            }
        }

        System.out.println(count);
    }
}
