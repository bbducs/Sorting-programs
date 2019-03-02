
public class QuickSort {

	void merge(int[] arr, int l, int m, int r) {
		// size of two array

		int n1 = m + 1 - l;
		int n2 = r - m;

		// create temporary array
		int[] L = new int[n1];
		int[] R = new int[n2];

		// copy data to Temporary array
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];

		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = L[j];
			j++;
			k++;
		}

	}

	void sort(int[] arr, int l, int r) {
		if (l < r) {

			// middle number
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted array
			merge(arr, l, m, r);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 3, 2, 1, 9, 7, 8 };
		System.out.println("before array");
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + "  ");
		}
		QuickSort obj = new QuickSort();
		obj.sort(arr, 0, arr.length - 1);
		System.out.println("sorted array");
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + "  ");
		}

	}

}
