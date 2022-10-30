import java.util.*;
class WithDraw extends Exception
{
    WithDraw(String msg)
    {
        super(msg);
    }
}
class Deposit extends Exception{
    Deposit(String msg)
    {
        super(msg);
    }
}
class userName
{
    private String name;
    private long accountNo;
    private long balance=0;
    userName(String name,long accountNo)
    {
        this.name=name;
        this.accountNo=accountNo;
    }
    void withdraw(long amount){
      try{

          if(balance<amount)
          {
              throw new WithDraw("the amount is greater than your amount");
          }
          balance-=amount;
          System.out.println(amount+" has been withdrawn from your account");
        }catch(WithDraw e)
        {
            System.out.println(e.getMessage());
        }

    }
    void deposit(long amount){
        try{
  
            if(amount>=100000)
            {
                throw new Deposit("Sorry!But you cant deposit more than 100000 in a single day");
            }
            balance+=amount;
            System.out.println(amount+" has been deposited from your account");
          }catch(Deposit e)
          {
              System.out.println(e.getMessage());
          }
  
      }
      void bankStatement()
      {
        System.out.println("*********************Bank Name*********************");
        System.out.println("Name: "+name);
        System.out.println("AccountNo: "+accountNo);
        System.out.println("Balance: "+balance);
      }


}
public class Question15 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        userName user=new userName("Umesh",100034938);
        System.out.println("Namaste!What would you like to do today");
        long amount;
        int choice;
        do{
            System.out.println("1.User details\n2.Deposit\n3.Withdraw\n4.exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                user.bankStatement();
                break;
                case 2:
                System.out.println("enter the amount you want to deposit");
                amount=sc.nextLong();
                user.deposit(amount);
                break;
                case 3:
                System.out.println("enter the amount you want to withdraw");
                amount=sc.nextLong();
                user.withdraw(amount);
                break;
                case 4:
                break;

            }
        }while(choice!=4);

     }    
}
