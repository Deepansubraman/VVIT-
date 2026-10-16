import java.util.*;

public class UpperLower {
    public static void main(String[] args) {
        String s="Hello";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            int as=s.charAt(i);
            if(as>97 && as<123)
            {
                
                str+=(char)(as-97+65);
            }
            else{
                str+=(char)(as-65+97);
            }

        }
        System.out.println(str);
    }
}
