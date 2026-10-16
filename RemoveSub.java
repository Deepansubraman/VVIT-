import java.util.*;
public class RemoveSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st=sc.nextLine();
        int j=0;
        String s="";
        int i=0;
        while(i<str.length() && j<st.length())
        {
            
            while(i<str.length() && j<st.length() && str.charAt(i)==st.charAt(j))
            {
                i++;
                j++;
            }
            if (j == st.length()) {  
                j = 0;              
                continue;            
            }
            s+=str.charAt(i);
            i++;
            
            j=0;
            
        }
        System.out.println(s);

    }
}
