public class MultiplicationTable
{
  public static void main (String [] args)
  {
    int size = IO.readInt();
    int rows = 1;
    int columns = 1;

    for (int i = 1; i <= size; i++){
      for(int j = 1; j <= size; j++ ){
        System.out.print(i*j + " ");
      }
      System.out.println();
    }

  }
}
