import java.util.Scanner;
public class PalindromeTest
{
   public static void main(String[] args) // hello
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter a string: ");
      String s = kb.nextLine().toLowerCase();
      System.out.printf("\"%s\" %s a palindrome\n", s,
                        palindrome(s,0,s.length()-1)? "is": "is not");
   }

   public static boolean palindrome(String s, int i, int j)
   {
      if (i < j)
         return (s.charAt(i) == s.charAt(j) && palindrome(s, i+1, j-1));
      else
         return true;
   }
}

