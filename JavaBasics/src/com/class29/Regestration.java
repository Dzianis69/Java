package com.class29;

/*
 * 3. Create Registration Class in which you would have variables
 *  as email, userName and password that have an access scope only
 *   within its own class. After creating an object of the class user 
 *   should be able to call methods and in each method s
 *   eparately pass values to set users email, username and password.
Requirements:
Valid email consider to be only gmail
Valid userName and password cannot be empty and should be of length larger than 6 characters. 
Also valid password cannot contain userName.
 */
public class Regestration {
	private String email, userName, password;

	/*public void setUserName(String userName) {
		if (!(userName.length() < 6) && (!userName.isEmpty())) {
			this.userName = userName;
		}
	}
*/
	public void setEmail(String email) {
		if (email.contains("@gmail")) {
			this.email = email;
		}
	}
	public void setUserName(String userName) {
        if (!userName.isEmpty()) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Username should be more than 6 characters");
            }
        } else {
            System.out.println("Username cannot be empty");
        }
    }
	public void setPassword(String password) {
        if (!password.isEmpty()) {
            if (password.length() > 6) {
                if (!password.contains(userName)) {
                    this.password = password;
                } else {
                    System.out.println("Password cannot contain username");
                }
            } else {
                System.out.println("Password should be more than 6 characters");
            }
        } else {
            System.out.println("Password cannot be empty");
        }
    }
	/*public void setPassword(String password) {
		if (!(password.length() < 6 && (!password.isEmpty()))) {
			if (!password.contains(this.userName)) {
				this.password = password;
	
			}
		}
	}
*/
	public void getInfo() {
		System.out.println(userName + " " + email + " " + password);
	}
}
