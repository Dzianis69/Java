package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] grade=new char[6];
grade[0]='A';
grade[1]='B';
grade[2]='C';
grade[3]='D';
grade[4]='E';
grade[5]='F';

int size=grade.length;
char[] grades = {'A','B','C','D','E','F'};
System.out.println(grade[1]);
System.out.println(grades[1]);
System.out.println(size);

String[] name = {"Max","Leha","Den","Yurec","Pozniak"};
System.out.println(name[2]);
String[] names=new String[5];
name[0]="Pozniak";
names[1]= "Max";
names[2]="Den";
names[3]= "Leha";
names[4]="Yrec";


System.out.println(names[2]);

String[] syntax= {" Java "," day "," Saturday "," coding "," is "};
System.out.println(syntax[2]+syntax[4]+syntax[0]+syntax[3]+syntax[1]+".");



}

}
