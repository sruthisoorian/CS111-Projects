public class Gas
{
  public static void main (String [] args)
  {
    double totalPrice = 0;
    System.out.println("Enter cost of gallon of gas: ");
    double pricePerGallon = IO.readDouble();
    System.out.println("Enter number of gallons: ");
    double gallonsOfGas = IO.readDouble();
    System.out.println("Are you paying with a credit card?");
    boolean usingCreditCard = IO.readBoolean();
    if (pricePerGallon < 0 || gallonsOfGas < 0)
    {
      IO.reportBadInput();
    }
    else
    {
      totalPrice = gallonsOfGas * pricePerGallon;
      if(usingCreditCard == true)
      {
          totalPrice *= 1.1;
          IO.outputDoubleAnswer(totalPrice);
      }
      else
      {
        IO.outputDoubleAnswer(totalPrice);
      }
    }
  }
}
