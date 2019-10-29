public class AppendRec
{
  public static void main (String[] args)
  {
    String j = appendNTimes("sruthi", 4);
    System.out.println(j);
  }
  public static String appendNTimes(String original, int n)
  {
    if (n == 0)
      return original;
    else
      return original + appendNTimes(original, n-1);

  }
}
