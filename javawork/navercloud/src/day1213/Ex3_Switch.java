package day1213;

import java.util.Scanner;

public class Ex3_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 년도와 월을 입력후 윤년인지 평년인지 출력하고
		 * 그 월이 몇일까지 있는지 구하시오
		 * 윤년이란 년도 %4==0&&년도%100!=0||년도%400==0
		 */
		Scanner sc = new Scanner(System.in);
		int year,month;
		
		System.out.println("년도와 월을 입력하세요");
		year=sc.nextInt();
		month=sc.nextInt();
		
		boolean b=year%4==0 && year%100!=0||year%400==0;//true 면 윤년 false면 평년
		if(b)
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 평년입니다");
		
		
		
		
		
		
		
		
		
	}

}