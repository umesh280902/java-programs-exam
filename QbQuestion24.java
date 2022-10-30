import java.util.*;
class Student{
    int Id;
    String name,branch;
    static String collegename=new String("TSEC");
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        Id=sc.nextInt();
        name=sc.next();
        branch=sc.next();
        sc.close();

    }
  static int countData( Student arr[])
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i].branch.equals("Computer"))||(arr[i].branch.equals("IT")))
            {
                ans++;
            }
        }
      return ans;
    }
}
class DifferentBranch extends Exception{
    DifferentBranch(String msg)
    {
        super(msg);
    }
}
public class QbQuestion24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        sc.close();
        Student arr[]=new Student[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the name Id Name and Branch for all students");
            arr[i]=new Student();
            arr[i].getData();
            try{
                if(!(arr[i].branch.equals(new String("Computer"))||arr[i].branch.equals(new String("IT")))){
                    throw new DifferentBranch("Student is from "+arr[i].branch +" Department");
                }  
            }catch(DifferentBranch e)
            {
                System.out.println(e.getMessage());
            }
        }
    System.out.println("the total number of students from computer and IT department are: "+Student.countData(arr));
    }
    
}
