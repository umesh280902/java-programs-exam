import java.io.*;
class QbQuestion8{
    void separateDigits(int num)
    {
        String s = Integer.toString(num);
         for(int i=0; i<s.length(); i++)
         System.out.print(s.charAt(i)+" ");
         System.out.println();
    }
    
    public static void main(String[] args)throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1,num2; 
		System.out.print("Please Enter Number1 = ");
		num1 =  Integer.parseInt(br.readLine());
        System.out.print("Please Enter Number2 = ");
        num2 = Integer.parseInt(br.readLine());
        System.out.printf("%d is the sum of %d and %d\n",num1+num2,num1,num2);
        System.out.printf("%d is the differnce of %d and %d\n",num1-num2,num1,num2);
        System.out.printf("%d is the product of %d and %d\n",num1*num2,num1,num2);
        System.out.printf("%d is the average of %d and %d\n",(num1+num2)/2,num1,num2);
        if(num1>num2)
        {
            System.out.printf("%d is the maximum of %d and %d\n",num1,num1,num2);
        }
        else
        {
            System.out.printf("%d is the maximum of %d and %d\n",num2,num1,num2); 
        }
        if(num1<num2)
        {
            System.out.printf("%d is the minimum of %d and %d\n",num1,num1,num2);
        }
        else
        {
            System.out.printf("%d is the minimum of %d and %d\n",num2,num1,num2); 
        }
         QbQuestion8 qb=new QbQuestion8();		
         qb.separateDigits(num1);
         qb.separateDigits(num2);

    }
}