import java.util.*;
public class wordCount{
    public static void main(String[] args) {
        
        String s="hi hello hi hello";
        int start=0;
        int end=0;
        HashMap<String,Integer>mp=new HashMap<>();
        while(end<s.length())
        {
            if(s.charAt(end)==' ')
            {
                
                mp.put(s.substring(start, end),mp.getOrDefault(s.substring(start,end), 0)+1);
                start=end+1;
            }
            
                end++;
            
        }
        mp.put(s.substring(start, end),mp.getOrDefault(s.substring(start,end), 0)+1);
        for(Map.Entry<String,Integer>mp1:mp.entrySet())
        {
            if(mp1.getValue()>1)
            {
                System.out.println(reverse(mp1.getKey())+" - "+mp1.getValue());
            }
        }
    }


    public static String reverse(String p)
    {
        String g="";
        for(int i=p.length()-1;i>=0;i--)
        {
            g+=p.charAt(i);
        }
        return g;
    }
}