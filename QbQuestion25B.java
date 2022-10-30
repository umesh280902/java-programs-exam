import java.util.Scanner;
import java.util.Vector;
public class QbQuestion25B {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter size of matrix one");
 int n1 = sc.nextInt();
 int m1 = sc.nextInt();
 Vector<Vector<Integer>> v1 = new Vector<>();
 for(int i=0; i<n1; i++){
 Vector<Integer> v = new Vector<>();
 for (int j=0; j<m1; j++){
 int temp = sc.nextInt();
 v.add(temp);
 }
 v1.add(v);
 }
 System.out.println("Enter size of matrix two");
 int n2 = sc.nextInt();
 int m2 = sc.nextInt();
 Vector<Vector<Integer>> v2 = new Vector<>();
 for(int i=0; i<n2; i++){
 Vector<Integer> v = new Vector<>();
 for (int j=0; j<m2; j++){
 int temp = sc.nextInt();
 v.add(temp);
 }
 v2.add(v);
 }
 System.out.println("for 1st matrix");
 checkSymmetric(v1);
 System.out.println("for 2nd matrix");
 checkSymmetric(v2);
 }
 static void checkSymmetric(Vector<Vector<Integer>> v) {
 int n=v.size();
 int m=v.get(0).size();
 try {
 if (n != m)
 throw new SymmetricException("It is not symmetric");
 for(int i=0; i<n; i++){
 for(int j=0; j<i; j++){
 if(v.get(i).get(j)!=v.get(j).get(i))
 throw new SymmetricException("It is not symmetric");
 }
 }
 System.out.println("It is symmetric");
 }catch (SymmetricException e){
 System.out.println(e);
 }
 }
}
class SymmetricException extends Exception{
    SymmetricException(String s){
    super(s);
    }
}   
