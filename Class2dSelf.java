public class Class2dSelf
{
  public static void main (String [] args)
  {
    String[][] room = new String[5][4];
    String[] students = {"ann", "bob", "cathy", "dave", "fran", "tina", "ron", "tim"};

    int count = 0;
    for (int r = 0; r < room.length; r++)
    {
      for(int c = 0; c < room[0].length; c++)
      {
        room[r][c] = students[count];
        count++;
      }
    }

  }
}
