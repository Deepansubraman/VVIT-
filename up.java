public class up{
    public static void main(String[] args) {
        String str="UDDDUUUUDDDU";
        int max=Integer.MIN_VALUE;
        int count=0;
        for(char ch: str.toCharArray())
        {
            if(ch=='U')
            {
                count++;
            }
            if(ch=='D')
            {
                count--;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}