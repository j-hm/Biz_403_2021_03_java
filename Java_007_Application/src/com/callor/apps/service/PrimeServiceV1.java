package com.callor.apps.service;

import java.util.Random;

/*
 * Version
 * 
 * 프로젝트 개발 : 개발자가 사용하는 중, Developer Version
 * 누군가에게 테스트 의뢰
 * 		-같은 팀의 누군가에게 의뢰하기 : 알파버전 Alpha Version
 * 		-외부의 다른 누군가에게 의뢰하기 : 베타버전 Beta Version
 * 사용자에게 배포(Deploy) : Release Version
 *      -실제 사용하는 사람들에게 설치해서 써라
 *      -최초 배포 : V1.00라고 버전 정보를 명시, R1.00
 *      -약간의 문제 발생하여 수정 : V1.01
 *      
 * 배포 후 사용자의 피드백을 받아서 수정하고 재배포
 * 		V1.xx, V1.xy ~
 * 
 * 사용자의 의견을 수렴하여 새로운 프로젝트를 기획, 제작, 배포
 * 		기존 프로젝트를 V1이라고 하고
 * 		새롭게 기능이 개선되어 배포된 프로젝트를 V2.xx라고 칭한다
 */

/*
 * main() 메서드에서 배열을 만들고 값을 저장 후
 * 프라임인가 검사해서 출력했다
 * 
 * 이 코드를 PrimeService클래스를 만들고
 * 분리해서 다시 작성하기
 */

// 클래스 이름짓기
//		첫글자 대문자 이후는 카멜 케이스
//		UpperCamelCase

// service 클래스
// main()에 종합적으로 작성된 코드를
// 메서드를 만들어 분리하고
// 코드관리를 쉽게하도록 하는 클래스(파일)들
public class PrimeServiceV1 {
	
	// 어떤 변수를 사용하여 프로젝트를 수행할 것인가
	// 여러(2개이상)의 메서드에서 공통으로 사용할 변수들은
	//			변수를 사용한다, 참조한다 : 저장, 읽기
	// 클래스 영역에 설정한다
	int[] intNums;
	
	// 생성자 (constructor) 메서드
	// 		- void 키워드를 사용하지 않는다
	// 		- 이름이 클래스와 같다
	// intNums배열을 설정(초기화, 개수지정)을 하여 사용할 준비
	public PrimeServiceV1() {
		intNums = new int[20];
	}
	// (일반) 메서드는 첫글자 소문자로 시작하여 lowerCamelCase
	// 변수 이름짓기와 같은 방식으로 생성
	// 랜덤클래스로 값을 만들어서 저장
	public void makeNums() { 
		Random rnd = new Random();
		
		for(int i =0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(50);
		}
	}
	
	// 저장된 값이 프라임인지 검사하여 출력하기
	public void printPrime() { 
		
		for(int arr = 0; arr<intNums.length; arr++) {
			int numP = intNums[arr];
			int num = 0;
			for (num = 2;num<numP;num++) {
				if(numP%num==0) {
					break;
				}
			}
			if(num<numP) {
				System.out.println(intNums[arr] + "소수가 아님");
			}else { 
				System.out.println(intNums[arr] + "소수임");
			}
		}
		
	}
	// 
	
	

}



















