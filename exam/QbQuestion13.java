import java.util.Scanner;
import java.util.*;
public class QbQuestion13{
        void sameElements(int arr1[],int arr2[])
        {
            System.out.println("the commmon elements are");

            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2.length;j++)
                {
                    if(arr1[i]==arr2[j])
                      System.out.println(arr1[i]+" and "+ arr2[j]+" are common elements present at "+ i +" and "+j);        
                }
            }
        }
        void display(int arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"|");
            }
            System.out.println();
        }


        public static int removeDuplicateElements(int arr[], int n){  
            if (n==0 || n==1){  
                return n;  
            }  
            int[] temp = new int[n];  
            int j = 0;  
            for (int i=0; i<n-1; i++){  
                if (arr[i] != arr[i+1]){  
                    temp[j++] = arr[i];  
                }  
             }  
            temp[j++] = arr[n-1];     
            // Changing original array  
            for (int i=0; i<j; i++){  
                arr[i] = temp[i];  
            }  
            return j;  
        }  
        public static int getSecondLargest(int[] a, int total){  
            int temp;  
            for (int i = 0; i < total; i++)   
                    {  
                        for (int j = i + 1; j < total; j++)   
                        {  
                            if (a[i] > a[j])   
                            {  
                                temp = a[i];  
                                a[i] = a[j];  
                                a[j] = temp;  
                            }  
                        }  
                    }  
                   return a[total-2];  
            } 
            public static int getSecondSmallest(int[] a, int total){  
                int temp;  
                for (int i = 0; i < total; i++)   
                        {  
                            for (int j = i + 1; j < total; j++)   
                            {  
                                if (a[i] < a[j])   
                                {  
                                    temp = a[i];  
                                    a[i] = a[j];  
                                    a[j] = temp;  
                                }  
                            }  
                        }  
                       return a[total-2];  
                } 
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            QbQuestion13 qb=new QbQuestion13();
            System.out.println("enter the size of the arrays");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int array1[]=new int[m];
            int array2[]=new int[n];
            System.out.println("enter the elements of the array 1");
            for(int i=0;i<m;i++)
            {
                array1[i]=sc.nextInt();
            }
            System.out.println("enter the elements of the array 2");
            for(int i=0;i<n;i++)
            {
                array2[i]=sc.nextInt();
            }
            qb.sameElements(array1, array2);
            System.out.println("removing duplicate elements from both the arrays");
            Arrays.sort(array1);//sorting array  
            int length1 = array1.length;  
             length1 = removeDuplicateElements(array1, length1);  
             //printing array elements  
           for (int i=0; i<length1; i++){  
           System.out.print(array1[i]+"|");  
        }  
        System.out.println();
            Arrays.sort(array2);//sorting array  
            int length2 = array2.length;  
             length2 = removeDuplicateElements(array2, length2);  
             //printing array elements  
           for (int i=0; i<length2; i++){  
           System.out.print(array2[i]+"|");  
         }
         System.out.println();  
      int result=getSecondLargest(array1, m);
      System.out.print("the second highest element for the array1 :");
      System.out.println(result);
      int result2=getSecondLargest(array2, n);
      System.out.print("the second highest element for the array2 :");
      System.out.println(result2);
      int result3=getSecondSmallest(array1, m);
      System.out.print("the second Smallest element for the array1 :");
      System.out.println(result3);
      int result4=getSecondSmallest(array2, n);
      System.out.print("the second Smallest element for the array2 :");
      System.out.println(result4);
             sc.close();
            


        }
        
    }