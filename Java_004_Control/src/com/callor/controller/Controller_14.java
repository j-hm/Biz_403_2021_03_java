package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		int numKor = rnd.nextInt(100) + 1;
		int numEng = rnd.nextInt(100) + 1;
		int numMath = rnd.nextInt(100) + 1;
		
		int intSum = 0;
		float floatAvg = 0.0f;
		
		intSum = numKor;
		intSum += numEng;
		intSum += numMath;
		
		floatAvg = (float)intSum / 3;
		
		System.out.println("국어 : " + numKor);
		System.out.println("영어 : " + numEng);
		System.out.println("수학 : " + numMath);
		
		System.out.printf("합계 : %d 평균 : %3.2f\n", intSum, floatAvg); 
		
		}
		
	}
