import java.util.*;

public class SortsMain
{
	public static void main(String[] args)
	{
		Random randGen = new Random();
		Scanner keyboard = new Scanner(System.in);
		boolean display	= false;
		System.out.println("Please enter the size of the array you would like to have sorted: ");
		int size  = keyboard.nextInt();
		long startTime = 0;
		long endTime = 0;
		double runTime =0;
		int[] data = new int[size];

		// generate values for the data array
		for(int i = 0;  i < size; i++)
		{
			data[i] = randGen.nextInt(10000);
		}
		System.out.println("\nAn array of "+size+ " random values was generated.");
		int show;
		do
		{
			System.out.println("Display data (1 yes / 0 no):");
			show  = keyboard.nextInt();
		} while(show < 0 || show > 1);

		if(show == 1)
			display = true;

		System.out.print("\n");
		// prints the values for the data array to the screen if display is true
		if(display)
		{
			System.out.println("\n  The generated array contains the following values: ");
			for(int y = 0; y<size; y++)
			{
				System.out.printf("%6d",data[y]);
				if((size+1)%10==0)
				System.out.println();
			}
			System.out.println("\n");
		}

		int[] copy = copyArray(data);
		startTime = System.nanoTime();
		SortCode.selectionSort(copy);
		endTime = System.nanoTime();
		runTime = (double)(endTime-startTime)/1000000000L;


		System.out.printf("Selection sort took %.7f seconds to sort the array.\n",runTime);
		// prints the values for the data array to the screen if display is true
		if(display)
		{
			System.out.println("\n  Order of the array after sort");
			for(int y = 0; y<size; y++)
			{
				System.out.printf("%6d",copy[y]);
				if((size+1)%10==0)
				System.out.println();
			}
			System.out.println("\n\n\n");
		}

		copy = copyArray(data);
		startTime = System.nanoTime();
		SortCode.insertionSort(copy);
		endTime = System.nanoTime();
		runTime = (double)(endTime-startTime)/1000000000L;

		System.out.printf("Insertion sort took %.7f seconds to sort the array.\n",runTime);
		// prints the values for the data array to the screen if display is true
		if(display)
		{
			System.out.println("\n  Order of the array after sort");
			for(int y = 0; y<size; y++)
			{
				System.out.printf("%6d",copy[y]);
				if((size+1)%10==0)
				System.out.println();
			}
			System.out.println("\n\n\n");
		}

		copy = copyArray(data);
		startTime = System.nanoTime();
		SortCode.mergeSort(copy);
		endTime = System.nanoTime();
		runTime = (double)(endTime-startTime)/1000000000L;

		System.out.printf("Merge sort took %.7f seconds to sort the array.\n", runTime);
		// prints the values for the data array to the screen if display is true
		if(display)
		{
			System.out.println("\n  Order of the array after sort");
			for(int y = 0; y<size; y++)
			{
				System.out.printf("%6d",copy[y]);
				if((size+1)%10==0)
				System.out.println();
			}
			System.out.println("\n\n\n");
		}
	}

	/* Pre: Recieves an int array
	 * Post: returns a new array that is a copy of the recieved array
	 */
	public static int[] copyArray(int[] data)
	{
		int[] data2 = new int[data.length];
		for(int i = 0;  i < data.length; i++)
		{
			data2[i] = data[i];
		}
		return data2;
	}
}
