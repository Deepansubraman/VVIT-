import java.util.*;
public class books{
    public static void main(String[] args) {
        int[] arr={4, 2, 3, 1};
        Arrays.sort(arr);
        int total=0;
        int count=0;
        for(int i:arr)
        {
            total=total+i;
            if(total<5)
            {
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}