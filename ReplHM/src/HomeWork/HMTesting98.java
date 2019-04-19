package HomeWork;

public class HMTesting98 {
	/*
	 * Output: Toyota Prius 4 120 30000.0 
	 * Toyota Prius 4 120 30000.0
	 *  unknown unknown 4 120 30000.0 
	 * Toyota Prius 4 90 0.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
		Car car2 = new Car("Toyota", "Prius", 120, 30000.0);
		Car car3 = new Car(4, 120, 30000.0);
		Car car4 = new Car("Toyota", "Prius", 4);
		System.out.println(car1.make+" "+car1.model+" "+car1.numberOfDoors+" "+car1.topSpeed+" "+car1.price);
		System.out.println(car2.make+" "+car2.model+" "+car2.numberOfDoors+" "+car2.topSpeed+" "+car2.price);
		System.out.println(car3.make+" "+car3.model+" "+car3.numberOfDoors+" "+car3.topSpeed+" "+car3.price);
		System.out.println(car4.make+" "+car4.model+" "+car4.numberOfDoors+" "+car4.topSpeed+" "+car4.price);
X1 obj = new X1();
System.out.println(obj.b);
	}

}
