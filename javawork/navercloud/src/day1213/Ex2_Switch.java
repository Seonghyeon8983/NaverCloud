package day1213;

import java.util.Scanner;

public class Ex2_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		
//		System.out.println("알파벳 한글자 입력");
//		ch=sc.nextLine().charAt(0);//입력한 문자열중 첫 글자를 char 타입으로 변환
//
//		switch (key) {
//		case 'a':
//		case 'A':
//			System.out.println("apple");
//			break;
//		case 'b':
//		case 'B':
//			System.out.println("banana");
//			break;
//		case 'c':
//		case 'C':
//			System.out.println("Computer");
//			break;
//			default:
//			System.out.println("a,b,c가 아닌 알파벳");
//		}
//		
		
		System.out.println("영어단어를 입력해주세요");
		String msg =sc.nextLine();
		
		switch (msg) {
		case "red": 
		case "Red":	
			System.out.println("빨강색");
			break;

		case "green": 
		case "GREEN":	
			System.out.println("초록색");
			break;
		default:
		System.out.println("빨강과 초록을 제외한 색상");	
		}
		
		
		
		
	}

}
