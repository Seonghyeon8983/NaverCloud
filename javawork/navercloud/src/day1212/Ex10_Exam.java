package day1212;

import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 상품(sang)과 수량(su),단가(dan) 을 입력받은후
		 * 총금액 (total)을 출력하시오
		 * 단, 수량이 5개 이상이염ㄴ 총금액의 10프로를 할인된 금액 으로 
		 * 도 같이 출력하시오
		 * 
		 * (ex)
		 * 상품명: 바나나킥
		 * 수량 5 개 
		 * 단가 1000원 
		 * 총금액 4500원
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		String sang;
		double su, dan, total;
		System.out.println("상품의 이름을 입력하시오");
		sang=sc.nextLine();
		System.out.println("상품의 수량과 단가를입력하시오");
		su=sc.nextInt();
		dan=sc.nextInt();
		
		total= su*dan*0.9;
		
		
		System.out.println("상품명:"+sang);
		System.out.println("수량 :"+su+"개");
		System.out.println("단가 :"+dan+"원");
		System.out.println("총금액"+total+"원");
		
		
		
		
		
		
		
		
		
		
	}

}
