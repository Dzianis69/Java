package HomeWork;

public class X1 {
	protected int b = 0;
	public static class X2 {
		 private X2() {
	    	  
	      }
	     static void met(){
	      System.out.println("Class X"+b);
	     
	    }
	  }
	protected  static class Y2 extends X2 {
	   static void met1(){
	      System.out.println("Class Y");
	    }
	  }
	  public static void main(String[] args) {
	    Y.met();
	  }
}
