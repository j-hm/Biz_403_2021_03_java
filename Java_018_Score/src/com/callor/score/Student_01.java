package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {
		String fileName = "src/student.txt";

		// 선언하는 코드와 새ㅑㅇ성하는 코드를 분리하자!!
		// FileWriter, FileReader : 파일을 오픈
		// PrintWriter, ButterReader : 내용을 쓰고 읽음
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			/*
			 * ======================================
			 * while(true) 반복문의 사용
			 * 1. 조건 없이 무한 반복을 수행하는 코드
			 * 2. 무한 반복 코드를 수행하는 과정에서
			 * 	  if() 조건문을 추가하여 반복을 중단하기
			 * 3. 무한반복을 조건으로 부여하여 탈출구를 만들때
			 * 	  일반적으로 쉽게 구현할 수 있는 코드
			 * 4. if() 조건문이 필요하고
			 * 	  때로는 추가되는 코드가 필요하기도 함
			 * 5. 무한반복 코드가 실행되는 동안에
			 * 	  탈출구를 어떻게 만들지 고민해야하고
			 * 6. 다양한 방법의, 다양한 조건의 탈출구를
			 * 	  필요할 때 적절하게 구현할 수 있다
			 * ======================================
			 */
			
			
			System.out.println("=".repeat(80));
			
			// 파일을 무조건 한 라인씩 읽어라
			while (true) {
				String reader = buffer.readLine();
				//파일의 끝에 다다르면 더이상 읽지마라
				//EOF(end of file)가 되면 reader 변수에 null값이 담기기 된다
				//reader에 null값이 담겨 있다 == 다 읽었다
				if (reader == null)  break;
				// 이후 연산 처리
				
				/*
				 * =====================================
				 * while(조건식) 무한반복문
				 * 1. 무한 반복코드가 중단되는 조건이 한 개만 있을 경우
				 * 2. 조건식을 어떻게 만들 것인가 잘 구상해야한다
				 * 3. while(조건식)이 시작되기 전에
				 * 	  조건이 true가 되도록 만들어야 한다
				 * 4. 적절하게 탈출을 하려면
				 * 	  코드 내에서 조건식이 false가 되도록
				 * 	  연산을 수행해야한다
				 * 5. 코드내에서 조건이 false가 되더라도
				 * 	  이후의 명령들이 한 번씩 진행되고 나서
				 * 	  탈출이 이루어진다
				  
				 * 최초에 while()문에서
				 * reader != null은 true가 된다
				 * != null 조건문을 실행하기 전에
				 * reader = buffer.readerLine()을 실행하고
				 * reader 저장된 값이 null인지 비교한다
				 * 1. reader = buffer.readerLine()을 실행하고
				 * 2. reader에 저정된 값을 마치 메서드가 리턴하는 것처럼 동작
				 * 3. ()리턴하는 값이 null인지 아닌지 비교한다
				 * 4. 그 결과가 true이면 계속 코드진행
				 * 5. 그 결과가 false이면 즉시 while명령이 끝난다
				  
				String reader = new String();
				while((reader = buffer.readLine()) != null) {
					/필요X/reader = buffer.readLine();
					System.out.println(reader);
				}
				
				 *위 두 줄과 같은 코드
				 */
				
				// students 배열은 자동으로 분해된 문자열 개수만큼 생성이 되고
				// 각 요소에 값이 저장된다
				String[] students = reader.split(":");
				System.out.printf("이름 : %s\t 주소 : %s\n", students[1], students[5]);
			}

			System.out.println("=".repeat(80));

			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생!");
		}
	}
}
