public class Zoo
{
  public static void main (String [] args)
  {
    int totalGiraffes = 0;
    int totalLions = 0;
    int totalSnakes = 0;
    System.out.println("Input the number of Zoos in the US: ");
    int numZoos = IO.readInt();
    while(numZoos > 0)
    {
      System.out.println("Enter Number of Giraffes:");
      int numGiraffes = IO.readInt();
      System.out.println("Enter Number of Lions:");
      int numLions = IO.readInt();
      System.out.println("Enter Number of Snakes:");
      int numSnakes = IO.readInt();
      totalGiraffes += numGiraffes;
      totalLions += numLions;
      totalSnakes += numSnakes;
      numZoos--;
    }//end while
    IO.outputIntAnswer(totalGiraffes);
    IO.outputIntAnswer(totalLions);
    IO.outputIntAnswer(totalSnakes);
  }
}
