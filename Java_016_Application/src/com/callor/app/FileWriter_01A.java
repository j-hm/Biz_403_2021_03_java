package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_01A {

	public static void main(String[] args) {
		/*
		 * 이클립스를 사용하여 프로젝트를 만들었을 때
		 * Project의 소스코드가 저장되는 곳은
		 * Project/src 폴더 이후에 패키지 이름으로 만들어진다
		 * 새로운 파일을 만들기 위해서
		 * src/package-name 폴더를 지정하는데
		 * 타이핑을 직접하다보면 오타가 발생할 수 있기 때문에
		 * 임의의 파일 Copy Qualified..를 사용하여 임의의 파일 이름을 가져오고
		 * 필요한 파일로 이름을 변경하여 사용한다
		 */
		String fileName = "src/com/callor/app/FileWriter_01A.java";
		
		//file과 관련된 클래스를 사용할 때는
		//객체 선언과 생성문을 분리하여 작성한다
		
		//FileWriter, PrintWriter를 객체로 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		//객체 생성
		//FileWriter 클래스를 객체로 생성할 때
		//만들(작성할, 새로 생성함) 파일이름(경로포함)을
		//생성자 매개변수로 전달해 주어야 한다.
		
		try {
			fileWriter = new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
