package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO;

/*
 * IolistVO는 1개의 데이터를 담을 수 있도록 설계하였다
 * 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 한다.
 * 데이터의 묶음을 처리할 떄는 보통 배열을 사용한다.
 * 하지만 배열은 그 구조상 사용이 다소 불편할 때가 많다
 * Java에서는 배열을 사용해야하는 프로젝트에서 
 *  List클래스를 사용한 객체를 생성하여 진행한다.
 */
public class IolistServiceV1 {

	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할텐데 
	 * 매입매출 데이터들의 묶음을 List형 객체 사용하겠다
	 * 
	 * List형 객체에 포함된 (개별)데이터는 IolistVO형으로 사용하겠다
	 * 
	 * 낱개 데이터는 IolistVO클래스 형으로 사용하고 
	 * 그 데이터들을 묶어서 List형으로 연산을 수행하겠다, 라는 선언
	 * 
	 * private 선언 : 혹시 외부에서 iolist 데이터에 접근하여 값을 저장하는 일을 방지하기 위함
	 * 
	 * protected 선언 : V1클래스를 상속하여 선언할 시 사용
	 */
	
	// TODO 멤버변수 선언하기
	protected List<IolistVO> iolist;
	protected Scanner scan;

	public IolistServiceV1() {
		// TODO 클래스 생성자
		iolist = new ArrayList<IolistVO>();
		scan = new Scanner(System.in);
	}

	// 퍼블릭으로 선언된 메서드는 객체.메서드()형식으로 호출이 가능한 메서드
	// 리턴타입이 명확히 결정되지 않았을 때는 void형으로 작성한다
	public void selectMenu() {

		// TODO 업무선택하기 메뉴
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("쇼핑몰 업무관리");
			System.out.println("-".repeat(50));
			System.out.println("1. 매입매출 등록");
			System.out.println("2. 매입매출 리스트 출력");
			System.out.println("0. 업무종료");
			System.out.println("=".repeat(50));
			System.out.print("업무선택>> ");
			int intMenu = scan.nextInt();

			if (intMenu == 1) {
				this.input();
			} else if (intMenu == 2) {
				this.printAllList();
			} else if (intMenu == 0) {
				System.out.println("업무가 종료되었습니다!");
				return; // while문이 한번 뿐이라 break;도 사용가능하긴함
			}
		} // end while
	}

	public void input() {
		// TODO 매입매출 등록하기
		System.out.println("=====================");
		System.out.println("매입 매출 등록");
		System.out.println("---------------------");
		System.out.println("상품명>> ");
		String pname = scan.next();

		System.out.println("거래일자(YYYY-MM-DD)>> ");
		String date = scan.next();

		System.out.println("거리처명>> ");
		String dname = scan.next();

		System.out.println("매입매출 구분>> ");
		String input = scan.next();

		System.out.println("수량>> ");
		Integer qty = scan.nextInt();

		System.out.println("매입단가>> ");
		Integer iprice = scan.nextInt();

		System.out.println("매출단가>> ");
		Integer oprice = scan.nextInt();

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(input);
		iolistVO.setQty(qty);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);

		// 저장한 데이터 확인하기!!
		this.printIolist(iolistVO);

		// 입력된 데이터를 리스트에 담기
		iolist.add(iolistVO);
	} // end input

	public void printAllList() {
		// TODO 저장된 리스트 출력하기
		
		System.out.println("=".repeat(50));
		System.out.println("매입매출 리스트");
		System.out.println("-".repeat(50));
		System.out.println("상품명\t거래일\t\t거래처\t구분\t수량\t매입단가\t매출단가");
		System.out.println("-".repeat(50));
		
		for (int i = 0; i < iolist.size(); i++) {
			//IolistVO vo = iolist[i] 와 같음
			
			//IolistVO vo = iolist.get(i);
			//this.printIolist(vo);
			//위 두줄과 아래 한줄 같은 코드
			this.printIolist(iolist.get(i));
		}
	}

	public void printIolist(IolistVO vo) {
		// TODO 1개 데이터 출력하기
		
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\n");
	}

}
