import java.util.*;
class addition extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            System.out.println("the sum is: "+sum);
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" Thread 1: the sum of the "+ n +" numbers is: "+ sum);
        sc.close();
    }
}
class display implements Runnable{
    public void run()
    {
        System.out.println("the even numbers are as follows:");
     for(int i=2;i<=20;i++)
     {
        if(i%2==0)
        {
            System.out.println("Thread 2:"+i);
        }
        try
        {
          Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
     }
    }

}
public class QbQuestion9 {
    public static void main(String[] args) {
   
        addition a=new addition();
        a.setPriority(5);
        a.start();
        display d=new display();
        Thread t=new Thread(d);
        t.setPriority(7);
        t.start();

    }
    
}
