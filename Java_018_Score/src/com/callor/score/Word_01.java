package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {
		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader); // 오픈한 파일의 임시저장소

			System.out.println("=".repeat(50));
			String reader = new String();
			while ((reader = buffer.readLine()) != null) {
				String[] words = reader.split(":");
				System.out.printf("%s\t %s\n", words[0], words[1]);
			}
			System.out.println("=".repeat(50));
			
			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
