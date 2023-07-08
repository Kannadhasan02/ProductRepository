package interviewprogram;

public class SecondLargest {
	public static void main(String[] args) {
		Integer[] arr = { 2, 6, 7, 8, 10, 5 };
//		int num = arr[arr.length - 3];
//	     System.out.println(num);
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			}

		}

		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("largest number is:" + largest);

	}
}
