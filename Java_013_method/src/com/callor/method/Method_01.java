package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class Method_01 {

	/*
	 * Random(난수) 수를 1개 생성하여 3의 배수인가?
	 */
	public static void main(String[] args) {
		/*
		 * 랜덤 클래스를 사용하여 rnd객체를 선언하고 
		 * 랜덤() 생성자 메서드를 호출하여 객체를 생성(초기화)하기
		 * 
		 * 객체를 선언만 하고 생성을 하지 않고
		 * 객체.메서드를 호출하면 널포인터익셉션이 발생한다
		 * 
		 * 널포인터익셉션 : 객체가 아직 실체가 없다
		 */
		Random rnd = null;
		rnd = new Random();
		//Random rnd = new Random();

		
		/*
		 * 스캐너 클래스를 사용하여 스캔 객체를 선언하고
		 * 스캐너() 생성자 메서드를 호출하여 스캔 객체를 생성한다
		 * 스캐너()생성자는 객체를 생성할 때 시스템.인(키보드입력장치)를 연결할 수 있도록
		 * 매개변수에 정보를 전달해주어야 한다
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 스트링 클래스를 사용하여 str1객체를 생성한다
		 * 스트링 클래스는 클래스이면서 변수적인 성질을 갖는 특별한 클래스이다
		 * 사용법이 클래스 방식이면서 일반적인 변수처럼 사용할 수 있다
		 * wrapper클래스도 그러한 성질을 갖는다
		 */
		String str1 = new String(); // 저장되는 값 : ""
		String str2 = new String("대한민국"); // 저장되는 값 : "대한민국"
		String str3 = "우리나라";
		
		/*
		 * int형 변수와 
		 * Integer wrapper를 사용하여 만든 변수
		 * 사용하는 기본 방법은 동일하다
		 * 
		 * Integer는 클래스적인 특성을 갖고 있다보니
		 * new Integer() 생성자를 사용하여 변수를 만들면
		 * 다소 엉뚱하게 작동되는 경우가 있다
		 * 지금은 Integer()생성자를 사용하여 변수를 만들지 못하도록 하고 있다
		 * 
		 * 숫자형 변수는 생성자를 사용하여 변수를 만들지 말자!~
		 */
		Integer int1 = 30;
//		Integer intNum1 = new Integer(); 쓰지 말라고 밑줄그어짐
		
		Integer intNum = rnd.nextInt(100) + 1; 	
		/*
		 * if 조건문을 사용하여 어떤 조건을 
		 * 조건에 완전히 일치하는 경우에는 ~하다,~다 라고 표현하고
		 * 조건에 일치하는 else를 사용하여 표현 할 때는
		 * 딱 맞아 떨어지는 어떤 조건을 찾기 어렵게 때문에 ~아니다 라고 표현하는 것이 좋다
		 * 
		 * 코드를 작성할 때 조건으로 명시한 이외의 경우는 가급적 ~~이 아니다라고 표현하자
		 */
		if(intNum % 3 == 0) {
			System.out.println("3의 배수다");
		} else {
			System.out.println("3의 배수 아니다");
		}

		
		
		
		
		
		
	}
}







