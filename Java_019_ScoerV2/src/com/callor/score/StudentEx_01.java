package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.impl.StudentServiceImplV1;

public class StudentEx_01 {

	public static void main(String[] args) {
		// 기본값으로 설정된 파일을 사용하여 진행
		StudentService stService 
					= new StudentServiceImplV1(); // student.txt 파일 여는 거
		
		//.../st.txt파일을 사용하여 객체 생성 진행
		StudentService stService2
					= new StudentServiceImplV1("src/com/callor/score/st.txt"); // 다른 파일을 열 수 있음
		stService.printStudent();

		stService.getStudent("00007");
	}
}
