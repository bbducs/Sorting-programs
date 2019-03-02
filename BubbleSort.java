import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 5, 3, 4, 1, 0 };
		sortArray(arr);
		
			System.out.print(Arrays.toString(arr));

	}

	private static void sortArray(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;

				}

			}
		}

	}
	

}
