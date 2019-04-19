package HomeWork;

public class HMTesting97 {
public static void main(String[] args) {
	Dog dog = new Dog("Tarzan", "Mutt", 50.0);
	Dog dogg = new Dog("Tarzan", 50.0);
	System.out.println(dog.name+" "+dog.breed+" "+dog.weight);
	System.out.println(dogg.name+" "+Dog.breed+" "+dogg.weight);
}
}
