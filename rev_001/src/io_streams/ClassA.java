package io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassA {
	
	void operations1() throws IOException {
		System.out.println("Reading the data from a file");
		FileInputStream fr=new FileInputStream("");
		System.out.println("connection created");
		int x;
		while((x=fr.read())!=-1) {
			System.out.println((char)x);
		}
	}

	public static void main(String[] args) {
		 

	}

}
