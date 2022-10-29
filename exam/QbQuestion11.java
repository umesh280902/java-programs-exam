import java.util.*;
public class QbQuestion11 {
 
    // Method to convert the string
    static String capitailizeWord(String str) {
        StringBuffer s = new StringBuffer();
 
        // Declare a character of space
        // To identify that the next character is the starting
        // of a new word
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
             
            // If previous character is space and current
            // character is not space then it shows that
            // current letter is the starting of the word
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
 
        // Return the string with trimming
        return s.toString().trim();
    }
 
    // Driver Code
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        // Declare the string
        System.out.println("enter a string with lower and upper casess");
        String s1 =new String();
             s1=sc.nextLine(); 
        // Convert that string into lowercase
        s1 = s1.toLowerCase();
 
        // Call the method to capitalize each word
        System.out.println(capitailizeWord(s1));
        sc.close();
    }
}