package day1212;

import java.util.Scanner;

public class Ex15_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 상품(sang)과 수량(su),단가(dan) 을 입력받은후
		 * 총금액 (total)을 출력하시오
		 * 단, 수량이 5개 이상이면 총금액의 10프로를 할인된 금액 으로 
		 * 다시 한번 출력해주세요(dctotal)
		 * 
		 * (ex)
		 * 상품명: 바나나킥
		 * 수량 5 개 
		 * 단가 1000원 
		 * 총금액 5000원
		 * 
		 * 10프로 DC된 금액은 4500원입니다 =>5개 이상일 떄만 출력하는 문장
		 */
		
		Scanner sc =new Scanner(System.in);
		String sang;
		double su, dan, total, dctotal;
		System.out.println("상품의 이름을 입력하시오");
		sang=sc.nextLine();
		System.out.println("상품의 수량을 입력하시오");
		su=sc.nextInt();
		System.out.println("상품의 단가를 입력하시오");
		dan=sc.nextInt();
		total=su*dan;
		dctotal= su*dan*0.9;
		
		
		System.out.println("상품명:"+sang);
		System.out.println("수량 :"+su+"개");
		System.out.println("단가 :"+dan+"원");
		System.out.println("총금액"+total+"원");
		
		if(su>=5)
		{
			System.out.println("10프로 DC된 가격은"+dctotal+"입니다");
		}
		
		
		
	}

}
