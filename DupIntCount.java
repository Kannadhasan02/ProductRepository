package interviewprogram;

public class DupIntCount {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 5, 6, 5 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element: " + arr[j] + ", at index " + j);
					count++;
				}
			}
		}

		System.out.println("Duplicate element count:" + count);

	}

}
