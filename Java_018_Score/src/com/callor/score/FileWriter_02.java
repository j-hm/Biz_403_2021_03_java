package com.callor.score;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_02 {

	public static void main(String[] args) {
		String fileName = "src/com/callor/score/test1.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			/*
			 * ???ㄴㄹㅇㄴㄹㄴㅇㄹ
			 * 
			 * 그럼에도 불구하고 파일라이터를 사용하는 이유는
			 * 파일라이터 생성자 두번째 파라메터 때문이다
			 * 뉴 파일라이터(객체이름
			 * 
			 * ???ㅇㄹㄴㅇㄹㄴㄹㅇㄴㄹc
			 * !!!!!!!!!!!!!!!!!!!!!추가해야함
			 * 
			 * 두번째 파라메터가 없거나, 폴스로 설정하면
			 * (값을 설정하지 않으면 기본값으로 폴스이다)
			 * 1. 기록하고자 하는 파일이 없으면 만들기
			 * 2. 기록하고자 하는 파일이 있으면 기존 파일을 삭제하고 다시 만들기
			 * 3. 항상 새로운 내용만 기록
			 * 
			 * 두번째 파라메터가 트루이면
			 * 1. 기록하고자 하는 파일이 없으면 만들기
			 * 2. 기록하고자 하는 파일이 있으면 Append Mode로 열기
			 * 3. 새로운 내용을 print()하면 기존 내용 끝에 이어서 기록
			 */
			fileWriter = new FileWriter(fileName, true);
			out = new PrintWriter(fileWriter);
			for (int i = 0; i < 10; i++) {
				out.printf("%05d\n", i + 1);
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
