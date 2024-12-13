package day1212;

import java.util.Scanner;

public class Ex8_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sangpum;
		int price;
		
		System.out.println("상품 가격입력");
		price=sc.nextInt();//1숫자만 읽고 엔터는 버퍼로 들어간다
		sc.nextLine();//3 이를 해결하기위해 엔터를 읽는 코드를 하나 추가한다. 
		System.out.println("상품명 입력");
		sangpum=sc.nextLine();//2버퍼의 엔터를 읽어온다(없을경우 키보드로부터 읽어온다)
		
		System.out.println(sangpum+"상품 가격은 "+price+"원 입니다");
		
		
		
		
		
		

	}

}
