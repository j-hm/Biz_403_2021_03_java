package com.callor.classes.service;

/*
 * 2까지는 학생의 성적을 입력받다가 중단을 하면 리스트를 보여주는 방식이었다
 * 3에서는 업무를 선택할 수 있는 메뉴를 보여주고
 * 메뉴에 따라 업무를 진행하도록 업그레이드
 * ==================
 * 빛나라 1
 * ------------
 * 1. 성적입력
 * 2.
 * 0.
 * ---------------
 * >>업무선택
 * ================
 */
public class ScoreServiceV3 extends ScoreServiceV2 {

	public void menuScore() {

		while (true) {

			System.out.println(Lines.dLine(50));
			System.out.println("빛나라 고교 성적 시스템 V1");
			System.out.println(Lines.sLine(50));
			System.out.println("1.한명 성적 추가");
			System.out.println("2.계속 성적추가");
			System.out.println("3.성적리스트 출력");
			System.out.println("0.업무종료");
			System.out.println(Lines.sLine(50));
			System.out.print("업무선택>> ");
			int intMenu = scan.nextInt();
			if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				while (true) {
					if (this.inputScore() == null) {
						break;
					}
				}
			} else if (intMenu == 3) {
				this.printScore();
			} else if (intMenu == 0) {
				System.out.println("업무종료!! 야호~ 퇴근이다>.<");
				return;
			}

		}

	}

}
