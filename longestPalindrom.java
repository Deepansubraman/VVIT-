import java.util.*;
public class longestPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=0;
        int end=0;
        int max1 = 0;
        int max2=0;
        int max=0;
        while(end<=s.length() && start<s.length()) {
            String sub=s.substring(start,end);
            if(palin(sub)) {
                if(sub.length()>max)
                {
                    max=sub.length();
                    max1=start;
                    max2=end;
                }
                
            }
            end++;
            if(end==s.length()) {
                start++;
                end=start;
            }
        }
        System.out.println(s.substring(max1,max2));
       
    }

    public static boolean palin(String sub)
        {
            int r=sub.length()-1;
            int l=0;
            while(l<r)
            {
                if(sub.charAt(r)!=sub.charAt(l))
                {
                    return false;
                }
                r--;
                l++;
            }
            return true;
        }
}
