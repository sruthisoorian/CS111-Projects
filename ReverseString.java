public class ReverseString
{
  public static void main(String[] args)
  {
    String word = "hello";
    String result = reversestring(word);
    System.out.println(result);
  }

  public static String reversestring(String word)
  {
    String output = "";
    char[] arr = new char[word.length()];
    for (int i = 0; i < word.length(); i++)
    {
      arr[i] = word.charAt(i);
    }
    for (int i = arr.length-1; i >= 0; i--)
    {
      output = output + arr[i];
    }
    return output;
  }


}
