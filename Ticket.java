public class Ticket
{
  public static void main (String [] args)
  {
    int fine = 0;
    int speed = IO.readInt();
    if (speed < 60)
    {
      fine = 0;
    }
    else if (speed > 90)
    {
      fine = 500;
    }
    else if (speed > 75)
    {
      fine = 200;
    }
    else
    {
      fine = 100;
    }
    IO.outputIntAnswer(fine);
  }
}
