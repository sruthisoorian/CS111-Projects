public class BuyingApples
{
  public static void main (String [] args)
  {
    System.out.println("Enter cost per LB: ");
    double costPerPound = IO.readDouble();
    System.out.println("Enter number of pounds: ");
    double lbsOfApples = IO.readDouble();
    if (lbsOfApples < 0 || costPerPound < 0)
    {
      IO.reportBadInput();
    }
    else
    {
      double totalCost = lbsOfApples * costPerPound;
      IO.outputDoubleAnswer(totalCost);
    }//end else
  }
}
