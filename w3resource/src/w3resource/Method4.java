package w3resource;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Write a Java method to count all vowels in a string. Go to the editor Test
		 * Data: Input the string: w3resource Expected Output: Number of Vowels in the
		 * string: 4
		 */
		String str = "w3resource";
		System.out.println("Number of Vowels in the	" + str + ": " + vovelsCount(str));
	}

	public static int vovelsCount(String str) {
		String[] array = new String[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			array[i] = str.substring(i, i + 1);
			if (array[i].equalsIgnoreCase("e") ||  array[i].equalsIgnoreCase("u")
					|| array[i].equalsIgnoreCase("i") || array[i].equalsIgnoreCase("o")
					|| array[i].equalsIgnoreCase("a")) {
				count++;
			}

		}
		return count;
	}
}
