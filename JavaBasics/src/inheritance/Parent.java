package inheritance;

public class Parent {
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.getReverse("Hello","Really");
		obj.getReverse("Hello");
		
	}

public void  getReverse(String s){
	char[] ch = s.toCharArray();
	for(int i = ch.length-1;i >= 0;i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	
}
public  void  getReverse(String s, String b){
	char[] ch = s.toCharArray();
	for(int i = ch.length-1;i >= 0;i--) {
		System.out.print(ch[i]);
	}
	System.out.print(" ");
	char[] ch1 = b.toCharArray();
	for(int i = ch.length-1;i >= 0;i--) {
		System.out.print(ch1[i]);
	}
	System.out.println();
}

}
