import java.util.*;
class WrongAnswer extends Exception
{
    WrongAnswer(String msg) {
        super(msg);
    }
}
public class QbQuestion17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String answer =new String();
        System.out.println("Who is the Prime Minister Of India");
        int attempt=1;
        while(attempt<=3)
        {
          try{

              System.out.println("please enter your answer");
              answer=sc.nextLine();
              attempt++;
              if(answer.equals("Narendra Modi"))
              {
                System.out.println("Excellent");
                System.exit(0);
              }
              else{
                throw new WrongAnswer("Wrong Answer");
              }
            }catch(WrongAnswer e)
            {
                System.out.println(" "+e.getMessage());
            }
        }
        System.out.println("Correct Answer is:Narendra Modi");
        sc.close();

    }
}
