import java.util.Scanner;
public class addmatrices {
    public static void main(String[] args)
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        n=sc.nextInt();
        int array1[][]=new int[m][n];
        int array2[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter elemnts of first matrix: ");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        array1[i][j]=sc.nextInt();
        System.out.println("Enter elemnts of second matrix: ");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        array2[i][j]=sc.nextInt();
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        sum[i][j]=array1[i][j]+array2[i][j];
        System.out.println("Sum of the given two matrices are: ");
        for(i=0;i<m;i++){
        for(j=0;j<n;j++)
        System.out.print(sum[i][j]+" ");
        }System.out.println();

    }

}

