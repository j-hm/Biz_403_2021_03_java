package com.callor.controller;
/*
 * JDK에는 수없이 많은 도구들이 포함되어 있다
 * 레고블럭을 이용해서 작품을 만드는 것처럼
 * JDK에 있는 도구들을 사용하여
 * 프로젝트를 만들 수 있다 
 * JDK에 있는 도구는 워낙 갯수가 많아
 * 한꺼번에 프로젝트에 포함하면
 * 프로젝트가 너무 거대해질것이다
 * 이러한 문제를 방지하기 위해
 * Java에서는 가장 기본적인 도구 외에는
 * 모두 파일로 제공하고, 필요에 따라 연결하여(import)하여
 * 사용할 수 있도록 하고 있다
 * 
 * import java.util.Random;
 * 지금부터 컨트롤러_06 클래스에서
 * java.util 패키지의 Random클래스라는
 * 도구를 사용하여 코딩하겠다, 라는 선언
 * 
 * 이클립스에서 도구를 사용하기 위해
 * import를 하고자 할 때는
 * Ctrl+shift+O
 * 
 * 코드의 모양을 정렬하기
 * Ctrl+shift+F
 */
import java.util.Random;

public class Controller_06 {
	public static void main(String[] args) {
		
		/*
		 * 프로젝트에서 JDK의 도구를 사용하는 방법~
		 * 변수를 선언하고 초기화하는 것과 유사
		 */
		Random rnd = null; // 선언
		rnd = new Random(); // 초기화
		
	}

}
