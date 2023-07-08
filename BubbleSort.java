package interviewprogram;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = {12, 2, 6, 7, 8, 10, 5 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];//a[0]=2--->2=a[I+1]
					arr[j + 1] = temp;//arr[0]--->12   temp=arr[0];
				}
		}

		
	}
		System.out.println(arr[n-2]);
		System.out.println("Sorted array" + Arrays.toString(arr));
	
		for (int b = 0; b < n; b++) {
			for (int k = 0; k < n - 1; k++) {
				if (arr[k] < arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];//a[0]=2--->2=a[I+1]
					arr[k + 1] = temp;//arr[0]--->12   temp=arr[0];
				}
		}

		
	}
		System.out.println(arr[1]);
		System.out.println("Sorted array" + Arrays.toString(arr));
	}
}


