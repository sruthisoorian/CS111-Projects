public class Voting
{
  public static void main (String [] args)
  {
    int age;
    System.out.println("Input your age: ");
    age = IO.readInt();

    if(age >= 18)
    {
      IO.outputStringAnswer("You can vote");
    }
    else
    {
      IO.outputStringAnswer("You can't vote");
    }
  }
}
