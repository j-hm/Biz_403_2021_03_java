package com.callor.method.service;

/*
 * InputServiceV2 클래스의 inputValue() 메서드에
 * "국어", 0, 100 값을 전달한 후
 * 리턴값이 널값이면 종료, 정수값이면 점수 : ?? 형식으로 출력 
 */
public class ScoreServiceV2 {
	/*
	 * InputServiceV2 클래스를 활용하는 메서드가 2개 이상일 경우에는 
	 * 모든 변수, 객체를 클래스 영역(멤버변수영역)에 선언하자 그리고
	 * 생성자에서 초기화하여 사용하도록 한다
	 */
	protected InputServiceV2 inService;

	public ScoreServiceV2() {
		inService = new InputServiceV2();
	}

	public void inputService() {
		// InputServiceV2클래스를 활용한 메서드가
		// 한곳뿐일때는 메서드 지역변수 영역에 선언하여 사용하면 된다
//		InputServiceV2 inService = new InputServiceV2();
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");
		}
	}
}
