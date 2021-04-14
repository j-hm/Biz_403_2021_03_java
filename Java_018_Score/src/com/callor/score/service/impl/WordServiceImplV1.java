package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.service.WordService;
import com.callor.score.service.model.WordVO;

public class WordServiceImplV1 implements WordService {

	protected List<WordVO> wordList;
	protected Scanner scan;
	protected final int 영어 = 0;
	protected final int 한글 = 1;

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		// word.txt 파일을 읽어서
		// wordList 데이터를 생성하는 메서드를
		// 생성자에 호출하여
		// 이 클래스WordServiceImplV1를 생성하면
		// 자동으로 실행되어 wordList 데이터를 준비하도록 하자
		this.loadWord();
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
				vo.setEnglish(words[영어]);
				vo.setKorea(words[한글]);
				wordList.add(vo);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 여는 동안 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일에서 데이터를 읽는 중 문제 발생");
		}
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {
		// TODO wordList에 담긴 데이터 중 임의 데이터 1개를 추
		int nWinCount = 0;
		int nLossCount = 0;
		while(true) {
			WordVO vo = this.getWord();
			System.out.println(vo.toString());
			
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어 단어는?(Quit:그만하기)");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strKor = scan.nextLine();
			if(strKor.equals("Quit")) {
				break;
			}
			
			if(strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("참 잘했어요");
				nWinCount++;
			} else {
				System.out.println("좀더 열심히 공부합시다");
				nLossCount++;
			}
			System.out.println("=".repeat(50));
			System.out.printf("성공 횟수 : %d\n", nWinCount);
			System.out.printf("실패 횟수 : %d\n", nLossCount);
			
		}
		System.out.println("Game Over");
	}

	protected WordVO getWord() {
		Random rnd = new Random();
		rnd.nextInt(100);// 0~99까지 중의 정수 1개 생성

		int nSize = wordList.size();
		int num = rnd.nextInt(nSize);

		WordVO wordVO = wordList.get(num);
//		System.out.println(wordVO.toString());
		return wordVO;

	}

}
