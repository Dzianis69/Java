package HomeWork;

/*
 * For you to do 
Please create the different methods with different access 
modifiers and try to access those methods in the main class 

In each method write the logic accordingly like if for private 
method write the logic in the println Statement as "This is 
Private Method" accordingly for rest methods should be a total 
of 4 outputs, please make sure they are same order that is printed below

Output:
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
 */
public class HM111 {
	private void priv() {
		System.out.println("This is Private Method");
	}
	 void def() {
		System.out.println("This is Default Method");
	}
	 protected void pro() {
			System.out.println("This is Protected Method");
		}
	 public void pub() {
			System.out.println("This is Public Method");
		}
	 public static void main(String[] args) {
		HM111 obj = new HM111();
		obj.priv();
		obj.def();
		obj.pro();
		obj.pub();
	 }
}
