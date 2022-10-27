import java.util.Scanner;
 class Item{
 String name;
 int qty;
 int price;
 Item(String name, int price) {
 this.name = name;
 this.price = price;
 this.qty = 0;
 }
 }

 public class QbQuestion5 {

 static Item[] intilizeList(){
 Item list[] = new Item[2];
 list[0] = new Item("Crocin", 15);
 list[1] = new Item("Diclogem", 10);
 return list;
 }

 static void printList(Item list[]){
 System.out.println("*******Medicine list**********");
for(int i=0; i<list.length; i++)
 System.out.println((i+1)+"."+list[1].name);
 }

 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 Item list[] = intilizeList();
 printList(list);

 for(int i=0; i<list.length; i++){
 System.out.println("Enter the qty for "+list[i].name);
 int qty = sc.nextInt();
 list[i].qty = qty;
 }

 int total=0;
 for(int i=0; i<list.length; i++){
 System.out.println(
 (i+1) + ".\t\t" + list[i].name +
 "\t\t" + list[i].qty + "\t\t" + list[i].qty +
 "\t\t" + (list[i].qty*list[i].price));
 total += list[i].qty*list[i].price;
 }
 System.out.println("\t\t\t\t\t\t\tTotal is: "+total);
 sc.close();
 }
}