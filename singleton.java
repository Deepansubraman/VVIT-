class singletonPattern {
    private static singletonPattern single;
    private singletonPattern()
    {
        System.out.println("hello");
    }
    public static singletonPattern getsingle()
    {
        if(single==null)
        {
            single=new singletonPattern();
        }
        return single;
    }

}
public class singleton{
public static void main(String[] args)
{
   
    singletonPattern s1=singletonPattern.getsingle();
    singletonPattern s2=singletonPattern.getsingle();
    if(s1==s2)
    {
        System.out.println("true");
    }
}
}
