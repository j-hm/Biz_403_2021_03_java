package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;
public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	/*
	 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면
	 * 고정된 파일이름("src/com/callor/score/student.txt")을
	 * 사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명")의 생성자 메서드를
	 * 다시 호출하는 구조가 된다
	 */
	public StudentServiceImplV1() {
		// 여기에서 다음의 생성자 메서드를 또 한 번 호출
		//new StudentServiceImplV1("src/com/callor/score/student.txt")

		this("src/com/callor/score/student.txt");
	}
	
	public StudentServiceImplV1(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		
		// 클래스를 객체로 생성할 때 메서드를 호출하여
		// 데이터를 사용하도록 준비해 달라
		this.loadStudent();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt파일에서 학생정보를 읽어
	 * studentList에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {
		// TODO 학생 명단 읽기

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				String[] students = reader.split(":");
				
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(students[학번]);
				studentVO.setName(students[이름]);
				studentVO.setGrade(students[학년]);
				studentVO.setDept(students[학과]);
				studentVO.setAddress(students[주소]);
				
				System.out.println(studentVO.toString()); //리스트 담긴 값 확인용 코드
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("! [" + this.studentFile + "]파일이 없습니다!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("!파일에서 데이터를 읽는 중 문제 발생!");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub
		int nSize = studentList.size();
		for(int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			if(num.equalsIgnoreCase(vo.getNum())) {
				//리턴값을 담고 리턴
//				System.out.println(vo);
				return vo;
			}
		}
//		System.out.println("![" + num + "]번은 등록되지 않은 학생입니다!");
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학년\t학과\t주소");
		System.out.println("=".repeat(80));
		
		/*
		 *배열을 사용하여 for반복문을 구현할 때는
		 *배열.length 속성을 직접 반복문의 조건으로 설정한다
		 *
		 *List객체는 특성상 수시로 데이터의 개수가 변경된다
		 *List에 담긴 개수를 알려주는 size()메서드는
		 *호출 될 때마다 List에 담긴 데이터의 개수를 다시 해아리는 코드가 실행된다
		 *
		 *for()반복문 내에서 i<list.size()코드를 사용하면
		 *반복되는 동안 계속해서 개수를 헤아리게 된다
		 *데이터의 개수가 몇 개 되지 않을 때는 큰 문제가 없지만
		 *데이터가 많아지면 그만큼 성능이 떨어지게 된다
		 *
		 *list전체를 for()반복문을 사용하여 순회할 때는
		 *먼저 size()값을 int형 변수에 담아놓고 시작하자
		 */
		int nSize = studentList.size(); // 포포몬쓰의 차이
		for(int i = 0; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getAddress() + "\n");
		}
		System.out.println("=".repeat(80));
	}

}
