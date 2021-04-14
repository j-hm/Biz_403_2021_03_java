package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.WordService;
import com.callor.score.service.model.WordVO;

public class WordServiceImplV1 implements WordService {

	List<WordVO> wordList;

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	}

	@Override
	public void loadWord() {
		// TODO Auto-generated method stub
		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			String reader = new String();
			while ((reader = buffer.readLine()) != null) {
				String[] words = reader.split(":");
				WordVO vo = new WordVO();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {
		// TODO Auto-generated method stub

	}

}
