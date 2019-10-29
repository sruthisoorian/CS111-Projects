public class LargestNumber
{
	public static void main (String [] args)
	{
		int num;
		int largest = 0;
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Enter a positive number");
			num = IO.readInt();
			if (num > largest)
			{
				largest = num;
			}
		}
		IO.outputIntAnswer(largest);
	}
}