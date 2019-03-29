package com.class12;

import java.util.Scanner;

public class Task2Pozniak {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your user name");
        String us = sc.nextLine();
        System.out.println("Please enter your password");
        String ps = sc.nextLine();
        System.out.println("Please confirm your password");
        String cps = sc.nextLine();

        // boolean flag=;
        if (us.isEmpty() || ps.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } else if (ps.length() < 8) {
            System.out.println("Password is too short");
        } else if (ps.contains(us)) {
            System.out.println("Password cannot contain username");
        } else if (!(ps.contentEquals(cps))) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }


}
