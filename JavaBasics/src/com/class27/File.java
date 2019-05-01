package com.class27;

/*
 * Create a class File that will have the following behaviors:
 *  open, edit, close. Edit and close are implemented method 
 *  while open is an abstract. Create 3 subclasses: JavaFile,
 *   WordFile, PDFFile that will provide specific implementation of open behaviour:
 *    Exmaple: to open .java file we need notepad++ or sublime tex,
 *     to open .doc file we need Microsoft word to be installed
 */
abstract class File {
	void close() {
		System.out.println("Close");
	}

	void edit() {
		System.out.println("Edit");
	}

	abstract void open();
}

class JavaFile extends File {

	@Override
	void open() {
		System.out.println("to open .java file we need notepad++");

	}

}

class WordFile extends File {

	@Override
	void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed");

	}

}

class PDFFile extends File {

	@Override
	void open() {
		System.out.println("Better DO NOT open ");

	}

}