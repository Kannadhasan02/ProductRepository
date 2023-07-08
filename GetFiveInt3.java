package interviewprogram;

import java.util.Arrays;
import java.util.List;

public class GetFiveInt3 {
	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if ((a.get(i) + a.get(j)) == 5) {
					System.out.println(a.get(i) + " " + a.get(j));
				}

			}

		}

	}
}
