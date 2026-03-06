import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    	int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int[] newNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;

		passes=myNums.length;
		comparisons=passes-1;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i=0; i<passes-1; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int m=0; m<comparisons; m++)
			{
				//If they are out of order, swap the values
				if(myNums[m]>myNums[m+1])
				{
					tempNum=myNums[m+1];
					myNums[m+1]=myNums[m];
					myNums[m]=tempNum;
				}

			//End Loop for comparisons
			}
			//The next pass will use one less comparison
			comparisons--;
			System.out.println(Arrays.toString(myNums));
		//End Loop for passes
  		}

		System.out.println(Arrays.toString(sortArray(newNums)));
	}
	
	public static int[] sortArray (int[] unsorted)
    {
		int passes;
		int comparisons;
		int tempNum;
		passes=unsorted.length;
		comparisons=passes-1;
        int[] sorted;
        sorted=unsorted;

        System.out.println(Arrays.toString(unsorted));
        for(int i=0; i<passes-1; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int m=0; m<comparisons-1; m++)
			{
				//If they are out of order, swap the values
				if(unsorted[m]>unsorted[m+1])
				{
					tempNum=unsorted[m+1];
					sorted[m+1]=unsorted[m];
					sorted[m]=tempNum;
				}

			//End Loop for comparisons
			}
			//The next pass will use one less comparison
			comparisons--;
			System.out.println(Arrays.toString(sorted));
		//End Loop for passes
  		}
			return sorted;
    }
}
