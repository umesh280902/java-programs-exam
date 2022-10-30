import java.util.*;
class BookNotFoundException extends Exception{
    BookNotFoundException(String msg)
    {
        super(msg);
    }
}
class Book{
    String Name,Author;
    int price,stock;
    Book(String Name,String Author,int price,int stock)
    {
        this.Name=Name;
        this.Author=Author;
        this.price=price;
        this.stock=stock;
    }
}
public class Question22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book[]=new Book[100];
        book[0]=new Book("Harry Potter", "JK Rowling", 3000, 100);
        book[1]=new Book("Justice League The Flashpoint paradox","Flash",2000,55);
        book[2]=new Book("Justice Society Of America","Black Adam",2500,65);
        book[3]=new Book("Justice League War","Zack Snyder",3500,20);
        book[4]=new Book("Justice League Apoclyapse","DCAU",4000,10);
        book[5]=new Book("Avengers Endgame","Russo Brothers",2500,15);
        System.out.println("HELLO");
        System.out.println("Please enter the title author and the quantity you want to buy");
        String title=sc.nextLine();
        String author=sc.nextLine();
        int flag=0;
        int store=0;
        for(int i=0;i<6;i++)
        if((title.equalsIgnoreCase(book[i].Name))&&(author.equalsIgnoreCase(book[i].Author)))
        {
            flag=1;
            store=i;
            break;
        }
        try{
        if(flag==1)
        {
            System.out.println("********BOOK DETAILS*********");
            System.out.println("Name: "+book[store].Name);
            System.out.println("Author: "+book[store].Author);
            System.out.println("Price: "+book[store].price);
            System.out.println();
            System.out.println("Enter the no of copies you want to buy");
            int n=sc.nextInt();
            if(n>book[store].stock)
            {
                System.out.println("the copies are not available "+ book[store].stock+ " is only available");
            }
            else
            {
                System.out.println("thanks for visting us");
                System.out.println("Total: "+(n*book[store].price));
                System.out.println("Looking forward for you");
            }
           }
            else {
             throw new BookNotFoundException("This book is not available");
            }
        }catch(BookNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
