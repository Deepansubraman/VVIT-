public class candy {
    public static void main(String[] args) {
        int people=10;
        int total_five=0;
        int sum=0;
        for(int i=1;i<=people;i++)
        {
            if(i%5==0)
            {
                total_five++;
            }
            sum+=i;
        }
        System.out.println(sum+(total_five*4));
    }
}
