import java.util.*;
class Telephone{
    long phoneno;
    String name;
    long pincode;
    Telephone(long p,long pn,String n)
    {
        this.phoneno=p;
        this.pincode=pn;
        this.name=n;
    }
}
class Display {
    // void sort(Telephone arr[])
    // {
    //     long temp;
    //  for(int i=0;i<arr.length;i++)
    //  {
    //     if(arr[i].pincode>arr[i+1].pincode)
    //     {
    //         temp=arr[i].pincode;
    //         arr[i].pincode=arr[i+1].pincode;
    //         arr[i+1].pincode=temp;    
    //     }
    //    }
    // }
    void display(Telephone arr[])
    {
        System.out.println("name\t\tphoneno\t\tpincode");
        for(int i=0;i<arr.length;i++)
        {
       System.out.println(arr[i].name+"\t\t"+arr[i].phoneno +"\t\t"+arr[i].pincode);
        }
   }
}
public class QbQuestion19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  phoneno,pincode;
        String name;
        Telephone obj[]=new Telephone[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter phone number");
            phoneno=sc.nextLong();
            System.out.println("enter pincode according to the phone number");
            pincode=sc.nextLong();
            obj[i]=new Telephone(phoneno,pincode,name);
        System.out.println();
        }
        sc.close();
    Display obj2 =new Display();
    obj2.display(obj);
    }
    
}
