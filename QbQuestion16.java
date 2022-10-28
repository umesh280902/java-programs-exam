import java.util.Scanner;

 public class QbQuestion16 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String s = sc.nextLine();
 System.out.println( (charCheck(s) && onlyCheck(s) && digitCheck(s) && 
firstCharCheck(s))? "Valid":"Invalid" );
sc.close();
 }
 static boolean charCheck(String s){
 return s.length()>=10 ? true : false;
 }
 static boolean onlyCheck(String s){
 s = s.toUpperCase();
 for(int i=0; i<s.length(); i++){
 if(!(s.charAt(i)>='A'&&s.charAt(i)<='Z') && !(s.charAt(i)>='0'&&s.
charAt(i)<='9'))

 return false;
 }
 return true;
 }
 static boolean digitCheck(String s){
 int ct=0;
 for(int i=0; i<s.length(); i++){
 if(s.charAt(i)>='0'&&s.charAt(i)<='9') ct++;
 }
 return ct>=2 ? true : false;
 }
 static boolean firstCharCheck(String s){
 return s.charAt(0)>='A'&&s.charAt(0)<='Z' ? true : false;
 }
 }
