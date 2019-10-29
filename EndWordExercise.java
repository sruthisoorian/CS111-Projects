public class EndWordExercise
{
	public static void main (String [] args)
	{
		String word;
		int count = 0;
		do
		{
			System.out.println("Enter word: ");
			word = IO.readString();
			if (!(word.equals("end")))
			{
				count++;
			}

		}while(!(word.equals("end")));
		IO.outputIntAnswer(count);
	}
}