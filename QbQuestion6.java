import java.util.Scanner;

class myexp extends Exception
{
    myexp(String msg)
    {
        super(msg);
    }
}
public class QbQuestion6 {
    Scanner sc=new Scanner(System.in);
    void readMatrix(int a[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void displayMatrix(int a[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int m,n,p,q;
        System.out.println("enter the rows and columns of the matrix 1");
        m=b.nextInt();
        n=b.nextInt();
        int matrix1[][]=new int[m][n];
        System.out.println("enter the rows and columns of the matrix 2");
        p=b.nextInt();
        q=b.nextInt();
        int matrix2[][]=new int[p][q];
        QbQuestion6 qb=new QbQuestion6();
        System.out.println("enter the elements of the matrix1");
        qb.readMatrix(matrix1,m,n);
        System.out.println("Matrix1=");
        qb.displayMatrix(matrix1,m,n);
        System.out.println("enter the elements of the matrix2");
        qb.readMatrix(matrix2,p,q);
        System.out.println("Matrix2=");
        qb.displayMatrix(matrix2,p,q);
      try {
        if(n!=p)
        {
            throw new myexp("Matrices cannot be multiplied");
        }
        else
        {
            System.out.println("the muliptllied matrix is:");
            int matrix3[][]=new int[m][q];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                {
                    for(int k=0;k<p;k++)
                    {
                    matrix3[i][j]=0;
                    matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            System.out.println("Matrix3=");
            qb.displayMatrix(matrix3,m,q);        
        }
      } catch (myexp e) {
       
        System.out.println(e.getMessage());
      }   
    }

}
