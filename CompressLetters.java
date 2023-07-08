package interviewprogram;

public class CompressLetters {
	public static void main(String[] args) {
		String s = "a3b2c4";

		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
//				System.err.println(s.charAt(i));
			}
			else {
				int num=Character.getNumericValue(s.charAt(i));
				for(int j=0; j<num;j++) {
				System.err.print(s.charAt(i-1));
				}
			}
			}
		
	}

}
