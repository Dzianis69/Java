
public class HM6two {
	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int large = 0;
		for (int i = 0; i < a.length; i++) {
			for (int q = 0; q < a[i].length; q++) {
				if (large < a[i][q]) {
					large = a[i][q];
				}
			}
		}
		System.out.println(large);
	}
}