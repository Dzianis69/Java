package ReviewClass;

public class ArrayRow2 {

	public static void main(ManSrt[] args) {
		// TODO Auto-generated method stub
		int[][] abc = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 }

		};
		int[] ab = new int[1];

		for (int i = 0; i < abc[1].length; i++) {

			ab[0] += abc[1][i];
		}

		System.out.println(ab[0] / abc[2].length);
		
		int[] a = new int[1];

		for (int i = 0; i < abc.length; i++) {
			

			a[0] += abc[i][2];
	
		}
		System.out.println(a[0] / abc.length);
	}

}
