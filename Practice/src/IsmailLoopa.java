import java.util.Scanner;

public class IsmailLoopa {

	public static void main(String[] args) {


        Scanner input=new Scanner (System.in);
        
        
        System.out.println("Please enter username?");
        String Username=input.nextLine();
        System.out.println("Please enter password?");
        String Password=input.nextLine();
        boolean noEmptyPassword=Password.isEmpty();
        boolean noEmptyUsername=Username.isEmpty();
        while (noEmptyPassword || noEmptyUsername) {
            System.out.println("Username and Password cannot be empty");
            
            System.out.println("Please enter username?");
            Username=input.nextLine();
            System.out.println("Please enter password?");
            Password=input.nextLine();
            }
        
        int lengthPassword=Password.length();
        
        while (lengthPassword<9) {
            System.out.println("Password is too short");
            System.out.println("Please enter password?");
            Password=input.nextLine();
            lengthPassword=Password.length();
            
                }

        
        boolean compare=Password.contains(Username);
        while(compare) {
            System.out.println("Password cannot contain username");
            System.out.println("Please enter password?");
            Password=input.nextLine();
            compare=Password.contains(Username);
        }
        
        String reTypePassword;
        
        System.out.println("Please re enter password?");
        reTypePassword=input.nextLine();
        boolean match=reTypePassword.equals(Password);
        while ( !(match)){
            System.out.println("Passwords do not match");
            reTypePassword=input.nextLine();
            match=reTypePassword.equals(Password);
        }
        
        System.out.println("Your username and password has been created");
    }

}
