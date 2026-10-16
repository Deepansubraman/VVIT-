import java.util.*;;
public class occurance {
    public static void main(String[] args) {
        String str="balloon";
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char ch:str.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
            }
            else{
                count++;
            }
        }
        System.out.println(set.size()*2+count);
    }
}
