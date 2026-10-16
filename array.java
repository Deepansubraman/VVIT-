public class array {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            int total=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]%2!=0)
                {
                    total+=arr[i][j];
                }
            }
            if(total%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
