import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    	int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;

		passes=myNums.length;
		comparisons=passes-1;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i=0; i<passes; i++)
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
		//End Loop for passes
  		}
		System.out.println(Arrays.toString(myNums));
	}
}
