public class AnagramsAndPalindromes
{
  public static void main (String [] args)
  {
    String a = "silent";
    String b = "listen";
    String c = "07470";

    System.out.println(anagram(a, b));
    System.out.println(palindrome(c));
    System.out.println(palindrome2(c));

  }//end of main method

  public static boolean anagram(String s1, String s2)
  {
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    if (s1.length() != s2.length())
    {
      return false;
    }

    for(int i = 0; i < s1.length(); i++)
    {
      if (s2.indexOf(s1.charAt(i)) == -1) // you will see indexOf(charAt()) numerous times
      {
        return false;
      }
      s2 = s2.substring(0, s2.indexOf(s1.charAt(i))) + s2.substring(s2.indexOf(s1.charAt(i)) + 1, s2.length());
    }
      return true;
  }//end of anagram method

  public static boolean palindrome(String s1)
  {
    for(int i = 0; i < s1.length(); i++)
    {
      if (s1.charAt(i) != s1.charAt(s1.length()-(i + 1)))
      {
        return false;
      }
    }
    return true;
  }
}//end of palindrome method

  public static boolean palindrome2(String s1)//more efficient
  {
    for(int i = 0; i < s.length()/2; i++) // "racecar" is 7 letters. 7/2 = 3 for ints. e would be character 3
    {
      if (s1.charAt(i) != s1.charAt(s1.length()-1-i))
      {
        return false;
      }
      return true;
    }
  }

// when you do .indexOf('letter not in word'), you get an output of -1;
//For String s = hello, s.indexOf("ell") , you get 1 bc it only find the index of the first character
