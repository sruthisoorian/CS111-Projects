public class TwoLargest
{
  public static void main (String [] args)
  {
    boolean looper = true;
    double highestValue1 = 0;
    double highestValue2 = 0;
    double newValue = 0;
    int numberOfInputs = 0;

    System.out.println("Enter your terminating value: ");
    double terminatingValue = IO.readDouble();

    while (looper == true)
    {
      System.out.println("Enter a new value: ");
      newValue = IO.readDouble();
      if(newValue != terminatingValue && numberOfInputs == 0)
      {
        highestValue1 = newValue;
        numberOfInputs++;
      }
      else if(newValue != terminatingValue && numberOfInputs == 1)
      {
        if (newValue < highestValue1)
        {
          highestValue2 = newValue;
          numberOfInputs++;
        }
        else
        {
          highestValue2 = highestValue1;
          highestValue1 = newValue;
          numberOfInputs++;
        }
      }
      else if (newValue == terminatingValue && numberOfInputs >= 2)
      {
        IO.outputDoubleAnswer(highestValue1);
        IO.outputDoubleAnswer(highestValue2);
        looper = false;
      }
      else if (newValue == terminatingValue && numberOfInputs < 2)
      {
        IO.reportBadInput();
      }
      else
      {
        numberOfInputs++;
        if (newValue > highestValue1)
        {
          highestValue2 = highestValue1;
          highestValue1 = newValue;
        }
        else if (newValue > highestValue2)
        {
          highestValue2 = newValue;
        }
      }

    }


  }

}
