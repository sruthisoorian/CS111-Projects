//For, While, Do While (Loops)
/*For is when you know how many times you want to run
While is when you know when you want it to run
Do While guarantees the loop will run at least once*/

//Make sure you comment out the loop that are not running in order to run this program

public static nAddition
{
  public static void main (String [] args)
  {
    int n = 0;
    do
    {
      System.out.println("Enter Num");
      n = IO.readInt();
    }while (n < 0)
//...........................................................
    for(int i = 1; i <= n; i++)
    {
      sum += i;
    }
    System.out.println("This is your for loop answer:")
    IO.outputIntAnswer(sum);
    sum = 0;
//.............................................................
    while (n > 0)
    {
      sum += n;
      n--;
    }
    System.out.println("This is your while loop answer: ")
    IO.outputIntAnswer(sum);
//...............................................................
    do
    {
      sum += n;
      n--;
    }while(n > 0)
    System.out.println("This is your while loop answer: ")
    IO.outputIntAnswer(sum);
  }
}
