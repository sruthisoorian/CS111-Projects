public class Multiply
{
  public static void main (String [] args)
  {
    int multiplicand;
    int multiplier;
    int product;
    System.out.println("Enter Number");
    multiplicand = IO.readInt();
    System.out.println("Enter Number");
    multiplier = IO.readInt();
    product = multiplicand * multiplier;
    IO.outputIntAnswer(product);
  }
}
