public class StringRec
{
  public static void main(String[] args)
  {
  }

  public static String decompress(String compressedText)
  {
    if(compressedText.length() == 1 || compressedText.length()== 0)
    {
      return compressedText;
    }
    if(!Character.isLetter(compressedText.charAt(0)))
    {
      char checker = compressedText.charAt(0);

      if(checker > '1')
      {
        checker--;
        compressedText = "" + checker + compressedText.substring(1);
        return compressedText.substring(1,2) + decompress(compressedText);
      }
      return compressedText.substring(1,2) + decompress(compressedText.substring(2));
    }
    return compressedText.substring(0,1) + decompress(compressedText.substring(1));
  }
}
