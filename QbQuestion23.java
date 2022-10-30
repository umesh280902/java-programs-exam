import java.util.*;
class Palin extends Exception{
Palin(String msg){
    super(msg);
}
}
public class QbQuestion23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("please a string");
        s=sc.next();
        sc.close();
        try{

            for(int i=0;i<s.length()/2;i++)
            {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                throw new Palin("It is not a Palindrome");
            }
           }
            System.out.println("It is a Palindrome");
        }catch(Palin e)
        {
            System.out.println(e.getMessage());
        }
    }
}
