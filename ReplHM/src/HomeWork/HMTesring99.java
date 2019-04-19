package HomeWork;

/*
 * Output:
 
 
Eggs 3 Produce true 10
Paper Towels 2 misc false 24
Paper Towels 2 null false 0
 */
public class HMTesring99 {
public static void main(String[] args) {
	

	StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
	StoreProduct obj2 = new StoreProduct("Papper Towells", 2, 24);
	StoreProduct obj3 = new StoreProduct("Papper Towwels", 3);
	System.out.println(obj1.label+" "+obj1.price+" "+obj1.category+" "+obj1.hasExpiration+" "+obj1.stock);
	System.out.println(obj2.label+" "+obj2.price+" "+obj2.category+" "+obj2.hasExpiration+" "+obj2.stock);
	obj3.category = null;
	System.out.println(obj3.label+" "+obj3.price+" "+obj3.category+" "+obj3.hasExpiration+" "+obj3.stock);
	

}
}