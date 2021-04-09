package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVOa;
import com.callor.app.service.ScoreService;
import com.jhm.standard.InputService;
import com.jhm.standard.impl.InputServiceImplV1;
/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다
 * 	가. 학번
 * 	나. 학생이름 : inputName()
 * 	다. 과목별 성적 : intputScore()
 * 
 * 	가. 학생성적입력 : inputScore() 시작
 * 		- 학번입력
 * 		- 이름입력
 * 		- 점수입력
 * 	나. 학생의 이름을 입력하는 inputName() method는
 * 		리턴타입이 String형이기 때문에
 * 		학생이름을 입력 받고 입력 받은 학생이름을 리턴한다
 * 		이 리턴 학생이름을 inputScore()에서 변수에 담아 처리할 수 있다
 */
public class ScoreServiceImplV1A implements ScoreService {

	// 학번, 점수를 입력받을 때 사용할 객체
	protected InputService inService;
	
	// 저장소
	protected List<ScoreVOa> scoreList;
	
	// 학생의 이름을 입력받을 때 사용할 객체
	protected Scanner scan;
	
	// 과목배열
	protected String[] subject;

	public ScoreServiceImplV1A() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVOa>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("\t\t성적 입력 및 리스트 출력");
			System.out.println("-".repeat(60));
			System.out.println("\t\t   1. 성적 입력");
			System.out.println("\t\t   2. 성적리스트 출력");
			System.out.println("\t\t   QUIT. 입력종료");
			System.out.println("=".repeat(60));
			System.out.print(">> ");
			String menuIn = scan.nextLine();
			if (menuIn.equals("QUIT")) {
				System.out.println("업무 종료 ;)");
				break;
			}
			try {
				Integer intNum = Integer.valueOf(menuIn);
				if (intNum == 1) {
					this.inputScore();
				} else if (intNum == 2) {
					this.printScore();
				} else {
					System.out.println("!입력오류!");
					System.out.println("올바른 메뉴를 선택해주세요");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("!입력오류!");
				System.out.println("1, 2, 3과 QUIT만 입력가능");
				continue;
			}
		}

	}

	@Override
	public String inputName(String title) {

		System.out.println(title + "을 입력하세요 (QUIT : 입력취소)");
		System.out.print(">> ");
		String strIn = scan.nextLine();
		if (strIn.equals("QUIT")) {
			return null;
		}
		return strIn;
	}

//	private String inputNum() {
		// TODO 학번입력부분이 너무 길어
		// 메서드로 나눠서 호출하여 사용하기
		
		// 학번입력처리 : 001, 002 형식으로 입력받자
				// ## Integer intNum = inService.inputValue("학번,1") => 우리가 만들어뒀던 것 활용!!
				// 정수 1이상을 입력하면 정수값이 intNum에 담길 것이고
				// QUIT를 입력했으면 null값이 intNum에 담길 것이다
				// ## if(intNum == null){
				//    return;
				//    }
				// null값이 담겨있으면 종료하고 다시 메뉴로 돌아간다
				// 정수를 입력했으면 입력받은 정수값을
				// 학번의 문자열 형식(001,002)로 변환을 하자
				// "%3d", intNum(1) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 "  1"
				// String.format("%03d", 1) : 전체 자릿수를 3개로 만들고 정수 값을 오른쪽 정렬하고
				//							  왼쪽의 빈칸에 0을 채워라 "001"
				// 학번입력 : 
				// ## String strNum = String.format("2021%03d", 1) = "2021001"
//		return null;
//	}
	
	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가
		
		
		while (true) {

			System.out.println("=".repeat(60));

			// #학번 입력 받기
			String num = this.inputName("학번");
			if (num == null) {
				return;
			} // 메뉴로 돌아가기
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(num);
			} catch (NumberFormatException e) {
				System.out.println("!학번은 숫자로만 입력!");
				continue;
			} // 학번 익셉션 검사 문자 -> 숫자

			// #이름 입력
			String name = this.inputName("이름");
			if (name == null) {
				return;
			} else if(name.equals("")) {
				System.out.println("학생이름은 반드시 입력해야합니다");
				continue;
			} // 메뉴로 돌아가거나 처음부터 입력..아 이름 어카지...너무 처음으로 가는 거 아니에여?

			/*
			 * 	if(num == null || name == null){
			 * 	return;
			 * 	}
			 *위 if비교문은 2개를 모두 입력하는 프롬프트가 나타난 후
			 *하나라도 QUIT하면 종료되는 코드이다
			 *만약 학번에서 QUIT를 하여도
			 *나머지 이름을 모두 입력받은 프롬프트가 나타나고
			 *모두 통과된 후에 입력 종료된다 
			 */
			
			
			
			// #성적 입력
			System.out.println(name + "의 성적을 입력해주세요");
			Integer[] score = new Integer[subject.length];

			for (int sb = 0; sb < subject.length; sb++) {
				score[sb] = inService.inputValue(subject[sb], 0, 100);
				if (score[sb] == null) {
					return;
				}
			}

			// #리스트 저장
			// 입력을 마쳤으면 VO에 담기
			ScoreVOa scoreVO = new ScoreVOa();
			scoreVO.setKor(score[0]);
			scoreVO.setEng(score[1]);
			scoreVO.setMath(score[2]);
			scoreVO.setName(name);
			scoreVO.setNum(intNum);

			// VO에 담긴 데이터를 List저장소에 추가
			scoreList.add(scoreVO);
			System.out.println(scoreList.toString());
		}

	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(60));
		System.out.println("\t\t고등학교 성적리스트");
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVOa scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getTotal() + "\t");
			System.out.printf("%3.2f\n", scoreVO.getAvg());
		}
		System.out.println("=".repeat(60));
	}

}
