package interviewprogram;



public class SortStr3 {
	private static int[] sortInt(String a) {
		String [] s=a.split(",");
		int [] g=new int[s.length];
		for (int i = 0; i < s.length; i++) {
			g[i]=Integer.parseInt(s[i]);
		}
		int temp = 0;
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (g[i] < g[j]) {
					temp = g[j];
					g[j] = g[i];
					g[i] = temp;
				}
			}

		}
		return g;
		}
	public static void main(String[] args) {
		int[] sort = sortInt("1,2,3,4,6,8,3");
		for(int r:sort) {
			System.out.print(r+" ");
		}
	}
	}



