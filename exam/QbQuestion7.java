import java.util.Scanner;

class odd extends Exception
{
    odd(String msg)
    {
        super(msg);
    }
}
public class QbQuestion7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0,num=0; 
        do{
            try{
           System.out.println("enter a number");
                num=sc.nextInt();
                if(num%2==1)
                {
                    throw new odd("Odd Number");
                }
                else{
                    total=total+num;
                }
            }catch(odd e)
            {
                System.out.println(e.getMessage());
            }

        }while(num!=0);
           System.out.println("the total of the number is: "+total);
           sc.close();      
    }
    
}
