package com.callor.method.service;
/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)에서는
 * 한 개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 
 * 선언할 수 없다.
 * 
 * 객체지향 프로그래밍 언어(Java)에서는
 * 한개의 클래스(파일)내에서 같은 이름의 함수를 
 * 중복하여 선언할 수 있다.
 * 한 개의 클래스에서 메서드를 중복 선언할 수 있다
 * 
 * 단, 조건이 있는데
 * ; 매개변수가 달라갸 한다
 * ; 매개변수에 타입, 개수, 순서가 다르면
 * ; 같은 이름의 메서드를 중복선언할 수 있다
 */
public class NumberServiceV1 {

	/*
	 * method이름은 addNum() 두 개의 정수를 매개변수로 받는다 
	 * ; 누구나 어디선가 addNum()를 호출할 때는 객체.addNum()
	 * ; 2개의 정수를 전달하게 하겠다,라는 선언 객체.addNum(100,200)
	 * 
	 * 두 개의 정수를 전달 받기 위해서는 method가 준비를 해야한다 
	 * ; 메서드의 괄호 안에 변수를 선언한다 
	 * ; 두 개의 변수 선언
	 * 
	 * 두 수의 합을 계산하여 
	 * ; 결과가 짝수이면 그 합을 ==> return 합; 
	 * ; 그렇지 않으면 null값을 리턴 ==> return null;
	 * 
	 * return 값 형식의 명령이 있으려면 
	 * void가 아닌 return타입을 지정해주어야 한다 
	 * ; 단순히 정수만 return하는 경우 int type으로 하면 되는데 
	 * ; 여기에서는 어떤 조건에 따라 null값을 return해야하는 경우도 있기 때문에 
	 * ; int type이 아닌 Integer type으로 설정해야 한다
	 */
	
	
	//TODO 두 정수의 합이 짝수인가 판별하는 method
	public Integer addNum(int num1, int num2) {
		
		
		// 1. 어떤 연산을 수행하고 연산 결과에 따라 리턴 등을 수행해야하는 경우
		//	  연산된 결과를 변수에 담아두고 이후에 코드를 진행하자
		int sum = num1 + num2;
		if (sum % 2 == 0) {
			return sum;
		}		
		return null;

		// 2. c언어와 같은 함수형 언어에서는 함수를 끝내는 리턴문을 한 번만 쓰자는 전통적인 패턴의 예시
//		Integer sum = null;
//		if((num1 + num2) % 2 == 0) {
//			sum = num1 + num2;
//		}
//			return sum;


		// 3. 계산식을 두번 쓰지 말고 변수 하나 만들어라
//		if((num1 + num2) % 2 == 0) {
//			return num1 + num2;
//		}



	} //end addNum(int num1, int num2)
	
	/*
	 * 자바의 메서드는 매개변수에 따라 호출하는 방식이 달라진다
	 * 
	 * 만약 addNum(정수, 정수) 방식으로 호출하려면 (int num1, int num2)형식으로 선언해야하고
	 * 만약 (실수, 실수) 방식으로 호출하려면 (float num1, float num2)형식으로 선언해야한다.
	 * 
	 * 메서드를 호출할 때 전달하는 데이터 타입에 맞도록 
	 * 메서드가 미리 만들어져 있어야 한다.
	 */
	
	//TODO 두 실수를 전달받아 짝수인가 판별하는 코드
	public Float addNum(float num1, float num2) {
		float sum = num1 + num2;
		if (sum % 2 == 0) {
			return sum;
		}
		//메서드코드가 아직 작성되지 않았을 때
		//문법 오류가 나는 것을 방지하는 임시코드
		return null;
		
	}

	public Float addNum(int num1, float num2) {
		return null;
	}

	public Float addNum(float num1, int num2) {
		return null;
	}
	
}
