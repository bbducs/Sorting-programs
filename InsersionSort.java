public class InsersionSort {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 9, 3, 4, 1, 5 };
		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	private static void sortArray(int[] arr) {
		int i, key,j;
		int n =arr.length;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]  = arr[j];
				j--;
			}
			arr[j+1] = key;
			
			
		}

	}
}
