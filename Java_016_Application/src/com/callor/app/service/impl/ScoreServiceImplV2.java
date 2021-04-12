package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.jhm.standard.InputService;
import com.jhm.standard.MenuService;
import com.jhm.standard.impl.InputServiceImplV1;
import com.jhm.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
	}

	@Override
	public void selctMenu() {
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만, 객체를 생성할 때 전달해야할 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는
		 * 코드를 작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트출력");
		scoreMenu.add("성적저장");

		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무종료!!");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO 학번입력, 이름입력, 과목별 성적입력
		// ScoreVO객체에 담고, list에 추가
		// = ScoreVO클래스를 사용하여 생성한 객체에 담고
		// = ScoreVO에 담고

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			String strNum = String.format("2021%03d", intNum);
			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO scoreVO = scoreList.get(i);
				if (strNum.equals(scoreVO.getNum())) {
					System.out.println("이미 입력된 학생입니다");
					continue;
				}
			}
		} // while end

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("=".repeat(80));
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			String strfileName = scan.nextLine();
			if (strfileName.equals("")) {
				System.out.println("파일이름을 입력해야합니다");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;

			strfileName = "src/com/callor/app/" + strfileName + ".txt";

			try {
				fileWriter = new FileWriter(strfileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.println(vo.getNum() + ",");
					out.println(vo.getName() + ",");
					out.println(vo.getKor() + ",");
					out.println(vo.getEng() + ",");
					out.println(vo.getMath());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해주세요");
				continue;
			}
			return;
		}

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
