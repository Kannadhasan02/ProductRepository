package interviewprogram;

public class DupIntArr {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 7, 8, 10, 5,2,6,7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j])) {
					System.out.println("Duplicate Element : " + arr[j]);
				}
			}
		}
	}
}