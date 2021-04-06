package com.callor.method.service;

public class NumberServiceV7 {

	String[] sub = { "국어", "영어", "수학", "과학", "국사" };
	Integer[] score = new Integer[5];
	
	public Integer inputScore() {
		InputService inService = new InputService();
		for (int i = 0; i < sub.length; i++) {
			Integer retNum = inService.inputValue(sub[i]);
			while (true) {
				if (retNum == null) {
					System.out.println("시스템을 종료합니다");
					return null;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("0~100이내의 값 입력");
					continue;
				}break;
			}//while end
				score[i] = retNum;
		}//for
		return null;
	}

}
