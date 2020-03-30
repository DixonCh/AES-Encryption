package com.generic;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		System.out.println("enter String to Encrypt");
		Scanner input = new Scanner(System.in);

		String name = input.nextLine();

		final String secretKey = "sssss";

		String originalString = name;

		String encryptedString = AES.encrypt(originalString, secretKey);

		String decryptedString = AES.decrypt(encryptedString, secretKey);

		System.out.println(originalString);
		System.out.println(encryptedString);
		System.out.println(decryptedString);
	}
}
