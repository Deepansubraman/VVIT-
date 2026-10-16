import java.util.*;;
public class unique {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        ArrayList<Character> set=new ArrayList<>();
        for(char ch:str.toCharArray())
        {
            if(set.contains(ch))
            {
                System.out.println("Not Unique");
                return;
            }
            else
            {
                set.add(ch);
            }
        }
        System.out.println("unique");
    }
}
