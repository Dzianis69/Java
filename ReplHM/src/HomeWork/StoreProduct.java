package HomeWork;

/*
 * 1. Complete the StoreProduct.java class:

Include the following class variables:
* label
* price (as an integer)
* category
* hasExpiration (as a boolean)
* stock (represents how many the store has available)
All class variables should be declared case sensitive

Write three constructors:

* The main constructor( with all parameters)
* A secondary constructor that does not have a category and an expiration (category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, and stock (stock defaults to 0)

Hint: each variable must be object specific
Output:
 
 
Eggs 3 Produce true 10
Paper Towels 2 misc false 24
Paper Towels 2 null false 0
 */
public class StoreProduct {
	public String label;
	public int price ;
	String category = "mics";
	boolean hasExpiration; 
	 int stock = 0;
	//1 
	 StoreProduct(String label, int price, String category, boolean hasExparation, int stock){
		 this.label = label;
		 this.price = price;
		 this.category = category;
		 this.hasExpiration = hasExparation;
		 this.stock = stock;
	 }
	 //2
	 StoreProduct(String label, int price, int stock){
		 this.label = label;
		 this.price = price;
		 this.stock = stock;
}
	 //3
	 StoreProduct(String label, int price){
		 this.label = label;
		 this.price = price;
		 
	 }

}