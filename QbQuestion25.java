import java.util.Scanner;
import java.util.Vector;
public class QbQuestion25{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Vector <Integer> v = new Vector<Integer>();
 for(int i=0; i<args.length; i++){
 v.add(Integer.parseInt(args[i]));
 }
 System.out.println("Enter the Position and Element to be added");
 int index = sc.nextInt();
 int num = sc.nextInt();
 v.add(index, num);
 System.out.println("Vector is: "+v);
 System.out.println("vector after deleting last elmt");
 v.remove(v.size()-1);
 printVector(v);
 }
 static void printVector(Vector<Integer> v){
 for(int i=0; i<v.size(); i++)
 System.out.print(v.get(i)+" ");
 }
}

