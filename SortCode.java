

public class SortCode
{


	/* Pre: recieves an array of ints
	 * Post: array is sorted in ascending order
	 */
	public static void selectionSort(int[] data)
	{

	}

	/* Pre: recieves an array of ints
	 * Post: array is sorted in ascending order
	 */
	public static void insertionSort(int[] data)
	{
		int itemsSorted;
		for (itemsSorted = 1; itemsSorted < data.length; itemsSorted++)
		{
			int temp = data[itemsSorted];
			int loc = itemsSorted -1;

			while (loc >= 0 && data[loc] > temp)
			{
				data[loc+1] = data[loc];
				loc -= loc;
			}
			data[loc+1] = temp;
		}
	}

	/* Pre: recieves an array of ints
	 * Post: array is sorted in ascending order
	 */

	public static void mergeSort (int[] a){

	}

	public static void merge (int[] a,int[] first, int[] last){

	}
}
