import java.util.*;
import java.util.Arrays;
public class QbQuestion20 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String input=new String();
    Vector<String> ans=new Vector<>();
    input=sc.nextLine();
      int start=0;
    for(int i=0;i<input.length();i++)
    {
      if(input.charAt(i)==' ')
      {
        ans.addElement(input.substring(start,i));
        start=i+1;
      }
    }
    ans.add(input.substring(start));
    for(int i=0;i<ans.size();i++)
    {
        char tempArr[]=ans.get(i).toCharArray();
        Arrays.sort(tempArr);
        ans.set(i,new String(tempArr));
    }
    for(int i=0;i<ans.size();i++)
    System.out.println(ans.get(i)+" ");
    sc.close();
} 
}