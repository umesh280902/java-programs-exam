import java.util.Scanner;
public class QbQuestion4 {
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a String");
 String s = sc.nextLine();

 String ans = "";
 s = s.trim();
 for(int i=0; i<s.length(); i++){
 if(s.charAt(i) == ' '){
 ans += s.charAt(i);
 while(s.charAt(i+1)==' ')
     i++;
     continue;
     }
     ans += s.charAt(i);
     }
    
     System.out.println(ans);
     sc.close();
     }
     
     }
    