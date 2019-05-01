package com.class27;

public class FileTest {
public static void main(String[] args) {
	File obj = new JavaFile();
	obj.open();
	obj = new PDFFile();
	obj.open();
	obj = new WordFile();
	obj.open();
}
}
