
public class selectionSort {
	public static void main(String[] args) {
		int arr[] = { 8, 7, 5, 3, 4, 1, 10 };
		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min_index = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			//swap array element
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}

	}

}
