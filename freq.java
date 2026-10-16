import java.util.*;
public class freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>mp:map.entrySet())

        {
            System.out.println(mp.getKey()+": "+mp.getValue());
        }
    }
}
