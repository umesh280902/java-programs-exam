import java.util.*;
class Input1{
    void getData(int arr[])
    {   
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();            
        }
        sc.close();
    }
    void puttData(int arr[])
    {   
        
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+"|");            
        }
        System.out.println();
    }
}
class Compare{
  void sameElements(int arr1[],int arr2[])
  {

      for(int i=0;i<arr1.length;i++)
      {  boolean flag=false;
        for(int j=0;j<arr2.length;j++)
        {
            if(arr1[i]==arr2[j])
            {
                flag=true;
            }
           }
            if(!flag)
            {
                System.out.println("arrays are unequal");
                System.exit(0);
            }
        }
        System.out.println("arrays are equal");
  }
}
public class QbQuestion21 {
           public static void main(String[] args) {
              Input1 I=new Input1();
              int array1[]=new int[8];
              int array2[]=new int[8];
              System.out.println("enter the elements of the array1 ");
              I.getData(array1);
              System.out.println("The elements of the array1 are");
              I.puttData(array1);     
              System.out.println("enter the elements of the array2 ");
              I.getData(array2);
              System.out.println("The elements of the array2 are");
              I.puttData(array2);
              Compare C=new Compare();
              C.sameElements(array1, array2);
           }    
}
