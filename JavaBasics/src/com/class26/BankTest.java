package com.class26;

public class BankTest {
	public static void main(String[] args) {
		Bank balance = new BankA();
		balance.getBalance();
		balance = new BankB();
		balance.getBalance();
		balance = new BankC();
		balance.getBalance();
	}
}
