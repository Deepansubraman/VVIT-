import java.util.*;
public class replaceAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String st=sc.nextLine();
        String str=sc.nextLine();
        String v=replace(s,st,str);
        System.out.println(v);
    }
    public static String replace(String s,String st,String str)
    {
        String y="";
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==st.charAt(0))
            {
                if(s.substring(i,i+st.length()).equals(st))
                {
                    y+=str;
                    i=i+st.length()-1;
                }
            }
            else
            y+=s.charAt(i);
        }
        return y;
        
    }
}
