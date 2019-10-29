public class MailExercise
{
	public static void main (String [] args)
	{
		System.out.println("Enter the weight of your mail");
		double weight = IO.readDouble();
		double total = 0.5;
		if (weight <= 0)
		{
			IO.reportBadInput();
			total = 0;
		}
		else
		{
			if (weight > 1)
			{
				total = total + ((weight-1) * 0.21);
			}
		}
		System.out.println("Your total is: $" + total);
	}
}