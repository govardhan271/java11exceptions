package com.dailycode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchSyntax {

	public static void tryCatch() {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("C:\\Users\\LOMADRED\\OneDrive - Capgemini\\Desktop\\dailylearn\\KafkaCommands.txt"));

			String line;
			while((line=br.readLine()) != null){
				System.out.println(line);
			}

		}catch(FileNotFoundException fne) {//FileNotFoundException is a child exception of IOException

			System.err.format("File not Found Exception {}", fne);

		}catch(IOException ioe) {//while chaining catch blocks specific exception first and general exception last

			System.err.format("IO Exception {}", ioe);
		}finally {
			try {

				if(br != null) {
					br.close();
				}

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
	
	public static void testTryCatchExecution() {
		
		StringBuilder sb = new StringBuilder();
		String str = null;
		try {
			sb.append('a');
			str.toUpperCase();
			sb.append('b');
		}catch(IllegalArgumentException e) {//Multi catch has special syntax
			sb.append('c');
		}catch (Exception e) {
			sb.append('d');
		}finally {
			sb.append('e');
		}
		System.out.println(sb);
	}

}
