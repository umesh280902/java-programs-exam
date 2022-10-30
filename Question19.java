import java.util.*;
class Telephone{
   Long Phoneno,pincode;
   String Name;
    void getDetails()
   {
    System.out.println("Please enter your name phoneno and pincode");
    Scanner sc=new Scanner(System.in);
    Name=sc.nextLine();
    Phoneno=sc.nextLong();
    pincode=sc.nextLong();
   }
   void displayDetails()
   {
    System.out.println("\t\t\t"+Name+"\t\t\t"+Phoneno+"\t\t\t"+pincode);
   }

   
}
public class Question19 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the details of 5 customers");
    Telephone T[]=new Telephone[5];
    for(int i=0;i<5;i++)
    {
        T[i]=new Telephone();
        T[i].getDetails();
    }
    System.out.println("displaying customer details with unsorted pincodes");
    for(int i=0;i<5;i++)
    {
        T[i].displayDetails();
    }
    System.out.println("displaying customer details with sorted pincodes");
    Telephone temp[]=new Telephone[5];
    for(int i=0;i<T.length;i++)
    {
        for(int j=0;j<T.length-1;j++)
        if(T[j].pincode>T[j+1].pincode)
        {
          temp[i]=new Telephone();
          temp[j]=T[j];
          T[j]=T[j+1];
          T[j+1]=temp[j];
        }
    }
    for(int i=0;i<5;i++)
    {
        T[i].displayDetails();
    }
   } 
}
