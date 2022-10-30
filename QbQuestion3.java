 import java.util.*;
public class QbQuestion3 {

 static void searchElmt(int arr[], int key){
 int i, n=arr.length;
 for (i = 0; i < n; i++) {
 if (arr[i] == key) {
 System.out.println("Element is present");
 break;
 }
 }
 if (i == n)
 System.out.println("Element is not present");
 }

 static void removeElmt(int arr[], int key){
 int result[] = new int[arr.length-1];

 for(int i=0, k=0; i<arr.length; i++){
 if(arr[i]==key)
 continue;
 result[k++] = arr[i];
 }
 for(int i=0;i<result.length;i++)
 {
    System.out.print(result[i]+" ");
 }
 System.out.println();
 }

 static int [] addElmt(int arr[], int val, int index){
 int result[] = new int[arr.length+1];

 for(int i=0, k=0; i<arr.length; i++, k++){
     if(i==index){
 result[k++]=val;
 }
 result[k]=arr[i];
 }
 return result;
 }

 static void findMaxMin(int arr[]){
 int max=Integer.MIN_VALUE;
 int min = Integer.MAX_VALUE;

 for(int i=0; i<arr.length; i++){
 if(arr[i]>max) max = arr[i];
 else if(arr[i]<min) min= arr[i];
 }
 System.out.println("max is: "+max + "\nmin is: "+min);
 }

 static void printArr(int arr[]){
 for(int i=0; i<arr.length; i++)
 System.out.print(arr[i]+" ");
 System.out.println("");
 }

 public static void main(String []args) {
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the elements of array");
 int n = sc.nextInt();

 int[] arr = new int[n];
 for (int i = 0; i < n; i++)
 arr[i] = sc.nextInt();

 System.out.println("Enter the value to be searched");
 int key = sc.nextInt();
 searchElmt(arr, key);

 System.out.println("Enter the value to be removed");
 key = sc.nextInt();
 removeElmt(arr, key);

 printArr(arr);

 System.out.println("Enter the value and position to be inserted");
 int val = sc.nextInt();
 int index = sc.nextInt();
 arr = addElmt(arr, val, index);

 printArr(arr);

 findMaxMin(arr);
 sc.close();
 }
 }
