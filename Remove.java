import java.util.*;
public class Remove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st=sc.nextLine();
        String s=RemoveSub(str,st);
        System.out.println(s);

    }
    public static String RemoveSub(String str,String st)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
            int temp=i;
            if(stack.size() >= st.length() && str.charAt(i)==st.charAt(st.length()-1))
            {
                for(int j=st.length()-1;j>=0;j--)
                {
                    if(stack.peek()!=st.charAt(j))
                    {
                        i=i-j-st.length();
                        break;
                    }
                    else
                    stack.pop();
                }
            }
        }
        String d="";
        while(!stack.isEmpty())
        {
            d=stack.pop()+d;
        }
        return d;
    }
}