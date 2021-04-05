package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {

	/*
	 * 생성한 수는 1~100까지의 난수 랜덤 수를 생성하여 
	 * 3의 배수이면 정수형 3의 배수 아니면 null을 리턴 
	 * ==>반드시 어떤 값을 return하기 
	 * 대표값으로 어떤 타입의 값을 리턴할 것인가
	 * 
	 * return 타입을 void가 아닌 정수형 타입으로 지정해야한다 
	 * int / Integer 리턴의 두 번째 조건에 null값을 리턴하라고
	 * 했기 때문에 Integer 사용해야함 
	 * int 사용 불가(정수만 가능)
	 * 
	 * 이 메서드는 정수형 3의 배수 또는 널값을 리턴해야하기 때문에 void가 아닌 Integer를 사용해야한다
	 * 
	 * void가 아닌 Integer를 사용하면 반드시 리턴 명령문과 리턴할 값이 코드에 있어야 한다
	 * 아직 메서드에 리턴문이 없기 떄문에 오류발생
	 * 
	 * 메서드에 오류가 나는 것을 없애기 위해 리턴문을 추가한다
	 * 
	 * 이 메서드는 리턴 명령문 만으로 처리가 되지 않고 반드시 리턴할 값이 있어야한다
	 * 
	 * primitive 타입중에 숫자형인 경유는 0을 wrapper 클래스 타입일 경우에는 null값을 사용
	 */

	/*
	 * void 키워드 : 메서드에 리턴 명령이 꼭 없어도 되는 경우
	 */

	public Integer inputNum() {
		Random rnd = new Random();
		Integer num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;

		if (num1 % 3 == 0) {
			return num1;
		}
		if (num2 % 3 == 0) {
			/*
			 * 현재 이 메서드의 리턴타입은 Integer이다
			 * 그런데 여기에서 리턴하는 num2변수의 타입은 int형이다
			 * 별다른 문제를 일으키거나 하지는 않지만
			 * 실제 코드가 작동될 때는 int형을 Integer클래스 형으로 변환하는 과정이 일어난다
			 */
			return num2;
		}
		return null;
	}

//	protected Random rnd;
//
//	public NumberServiceV1() {
//		rnd = new Random();
//	}
//
//	public Object inputNum() {
//
//		int rndNum = rnd.nextInt(100) + 1;
//		if (rndNum % 3 == 0) {
//			return rndNum;
//		} else {
//			return null;
//		}
//	}

}
