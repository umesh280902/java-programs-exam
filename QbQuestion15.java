import java.util.Scanner;
public class QbQuestion15 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int amount;
 UserAccount user1 = new UserAccount("Abhishek", 1000342012);
 do {
 System.out.println("*************ATM Simulate**************");
 System.out.println("1.Deposit\n2.Withdraw\n3.Statement of balance\n4.Exit");
 System.out.println("Enter your choice");
 int choice = sc.nextInt();
 switch (choice){
 case 1:
 System.out.println("Enter the amount");
 amount = sc.nextInt();
 user1.depositAmount(amount);
 break;
 case 2:
 System.out.println("Enter the amount");
 amount = sc.nextInt();
 user1.withdrawAmount(amount);
 break;
 case 3:
 user1.balanceStatement();
 break;
 case 4:
 System.exit(0);
 break;
 default:
 System.out.println("Invalid choice!!!!!!!");
 }
 System.out.println("\n\n");
 }while(true);

 }
}
class UserAccount{
 private int balance=0;
 private String name;
 private long accNo;
 UserAccount(String name, long accNo){
 this.name = name;
 this.accNo = accNo;
 }
 void withdrawAmount(int amount){
 try {
 if (amount > balance) {
 throw new WithDrawException("the amount to be removed is \n" +
 "greater than the balance");
}
balance-=amount;
System.out.println("You have successfully withdrawn Rs: "+amount);
}catch (WithDrawException e){
System.out.println(e);
}
}
void depositAmount(int amount){
try {
if (amount >= 100000) {
throw new DepositException("the amount to be deposited is \n" + "greater than 1, 00,000 RS");
}
balance+=amount;
System.out.println("You have successfully deposited Rs: "+amount);
}catch (DepositException e){
System.out.println(e);
}
}
void balanceStatement(){
System.out.println("*****************YOUR BALANCE STATEMENT*****************");
System.out.println("user: "+name);
System.out.println("Account no. "+accNo);
System.out.println("Balance: "+balance);
}
}
class WithDrawException extends Exception{
WithDrawException(String s){
super(s);
}
}
class DepositException extends Exception{
DepositException(String s){
super(s);
}
}

