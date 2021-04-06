package com.callor.method.service;

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



	}
}
