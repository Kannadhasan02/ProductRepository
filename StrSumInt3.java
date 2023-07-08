package interviewprogram;


public class StrSumInt3 {
	public static void main(String[] args) {
		String data = "1+3-2";
		String[] a = data.split("[+-]");
		String[] b = data.split("\\d+");
		int result = Integer.parseInt(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (b[i].equals("+")) {
				result += Integer.parseInt(a[i]);
			} else {
				result -= Integer.parseInt(a[i]);
			}
		}
		System.out.println(result);
		
	}
	

	

	  }

