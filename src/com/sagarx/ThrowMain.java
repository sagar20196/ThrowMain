package com.sagarx;

/**
 * THrows keywordis used with method signature to declare the exceptions that
 * the method might throw.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowMain {

	public ThrowMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	throws FileNotFoundException,IOException 
	{
		//FileReader= new FileReader("Something");
		FileReader fr=null;
		if(fr==null) {
			throw new FileNotFoundException();
		}else {
			throw new IOException();
		}
		
	}

}
