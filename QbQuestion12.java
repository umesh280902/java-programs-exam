import java.util.*;
class digits{
    void separateDigits(int num)
    {
        String s = Integer.toString(num);
         for(int i=0; i<s.length(); i++)
         System.out.print(s.charAt(i)+" ");
         System.out.println();
    }
    void threeNumbers(int n1,int n2,int n3)
    {
        if(n1==n2&&n2==n3&&n1==n3)
         {
             System.out.println("all numbers are equal");
        }
        else if(n1==n2||n2==n3||n3==n1)
        {
            System.out.println("neither are equal or different");
        }
        else
        {
            System.out.println("all are different");
        }
    }
    void oneNumber(int n)
    {
        if(n>0)
        {
            System.out.println("it is positive integer");
        }
        else if(n<0)
        {
            System.out.println("it is a negative integer");
        }
        else
        {
         System.out.println("it is zero");   
        }
    }
}
public class QbQuestion12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,num4,num5;
               int choice;
        digits d=new digits();
               do{
                   System.out.println("1.check for sign of a number\n2.separate the digits\n3.check for three numbers\n");
                   choice=sc.nextInt();
                   switch(choice)
                   {
                       case 1:
                       System.out.println("enter a number");
                       num1=sc.nextInt(); 
                       d.oneNumber(num1);
                       break;
                       case 2:
                       System.out.println("enter a number");
                       num2=sc.nextInt(); 
                       d.separateDigits(num2);
                       break;
                       case 3:
                       System.out.println("enter 3 numbers");
                       num3=sc.nextInt(); 
                       num4=sc.nextInt(); 
                       num5=sc.nextInt(); 
                       d.threeNumbers(num3,num4,num5);
                       break;
                       case 4:
                       System.out.println("exited successfully");
                       break;
                    }
               }while(choice!=4);
           sc.close();
    }
}
