import java.util.*;
public class degreeMatrix{
    public static void main(String[] args)
    {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        int degree=sc.nextInt();
        while(degree>0) 
        {
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=i;j<matrix[0].length;j++)
                {
                    
                        int temp=matrix[i][j];
                        matrix[i][j]=matrix[j][i];
                        matrix[j][i]=temp;
                    
                }
            }
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length/2;j++)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][matrix[0].length-1-j];
                    matrix[i][matrix[0].length-1-j]=temp;
                }
            }
            degree-=90;
        }
         for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
       }
}