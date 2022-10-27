import java.util.Scanner;

interface exam{
   public boolean Pass(int marks);
}
interface classify{
    public String division(int average);
}
class result implements exam,classify{
    public boolean Pass(int marks)
    {
        if(marks>40)
        return true;
        else
        return false;
    }
    public String division(int average)
    {
    if(average>=81&&average<=100)
    {
        return "first";
    }
    else if(average>=61&& average<=80)
    {
        return "second";
    }
    else if(average>=50&&average<=60)
    {
        return "third";
    }
    else
    {
        return "pass";
    }
    }
}
public class QbQuestion1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of the three subjects");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int average=(marks1+marks2+marks3)/3;
        result r=new result();
      if(r.Pass(average)){
        System.out.println("Passed");
        System.out.println("Division is: "+r.division(average));
      }
       else
       {       System.out.println("failed");
    }
    sc.close();
}
}
