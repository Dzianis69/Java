import java.util.Scanner;

public class Task1Switch {
public static void main(String[] args) {
	String country,lung;
	Scanner input=new Scanner(System.in);
	System.out.println("Input your country");
	country=input.nextLine();
	switch(country) {
	case "Belarus":
		lung="Belarusian";
		break;
	case"Russia":
			lung="russian";
			break;
	case "Ukraine":
		lung="ukranian";
			break;
	case "Poland":
		lung="Polish";
		break;
	case "Chezh Republic":
		lung="chezh";
		break;
	case "Slovakia":
		lung="slovak";
		break;
	case "Norway":
		lung="norwegian";
		break;
		default:
			lung="unknown";
		
	
	}
	System.out.println("Your countru is "+country+" and your lunguage is "+lung+".");
}
}
