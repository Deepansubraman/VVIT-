public class moveHash {
    public static void main(String[] args) {
        String str="Move#Hash#to#Front";
        String ans="";
        String ans2="";
        for(char ch:str.toCharArray())
        {
            if(ch=='#'){
                ans+='#';
            }
            else{
                ans2+=ch;
            }
        }
        System.out.println(ans+ans2);
    }
}
