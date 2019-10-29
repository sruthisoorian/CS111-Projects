public class Compress
{
  public static void main (String[] args)
  {
    String j = compress("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT");
    System.out.println(j);
  }
  public static String compress (String original)
  {
    String output = "";

    int n = original.length();
    for (int i = 0; i < n; i++)
    {
      int looper = 1;
      while(i < n-1 && original.charAt(i) == original.charAt(i+1))
      {
        looper++;
        i++;
      }
      if (looper != 1)
      {
        output = output.concat(Integer.toString(looper));
        output = output.concat(Character.toString(original.charAt(i)));
      }
      else
      {
        output = output.concat(Character.toString(original.charAt(i)));
      }
    }
    return output;
  }
}
