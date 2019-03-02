import java.util.Arrays;

public class bubbleRecursive {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 3, 2, 1, 6, 5, 22, 9 };
		sortArray(arr, arr.length);
		System.out.println("print sorted Array");
		System.out.println(Arrays.toString(arr));
	}
	private static void sortArray(int[] arr, int n) 
	{
		if (n == 1)
			return;

		for (int i = 0; i < n - 1; i++) 
		{
			if (arr[i] > arr[i + 1])
			{
				// swap
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
		sortArray(arr, n - 1);

	}

}
