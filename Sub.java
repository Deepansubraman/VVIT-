import java.util.Scanner;

public class Sub{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String st=sc.nextLine();
        int count=0;
        int right=0;
        int left=0;
        for(int i=0;i<str.length()-st.length()+1;i++)
        {
            if(str.charAt(i)==st.charAt(0))
            {
                if(str.substring(i,i+3).equals(st))
                count++;
            }
        }
        System.out.println(count);
    }
}