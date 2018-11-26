package br.com.biblioteca.util;

import java.util.Scanner;

public class BibliotecaUtil {

	private BibliotecaUtil() {
		
	}
	
	public static Scanner leitor;
	
	static {
		leitor = new Scanner(System.in);
	}

}
