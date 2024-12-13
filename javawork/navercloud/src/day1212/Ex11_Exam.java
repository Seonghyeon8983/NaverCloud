package day1212;

import java.util.Date;
import java.util.Scanner;

public class Ex11_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 년(year),월(month),일(day)를 입력
		 * 해당 날짜에 대한 Date 클래스를 생성후(myDate)
		 *  (myDate) 를 이용해서 년도,월,일,요일(week)을 구해서 출력하시오
		 * 요일은 요일숫자(weekNum)을 먼저 얻은후 요일을 구해서 출력
		 */

		Scanner sc = new Scanner(System.in);
		int year,month,day,weekNum;
		Date myDate;
		System.out.println("년도 입력");
		
		
		System.out.println("년,월,일 을 입력하시오");
		year=sc.nextInt();
		month=sc.nextInt();
		day=sc.nextInt();
		
		myDate=new Date(year-1900,month-1,day);
		
		weekNum=myDate.getDate();
		
		System.out.println(year+"년"+month+"월"+day+"일");
		System.out.println("년도"+(myDate.getYear()+1900));
		System.out.println("월"+(myDate.getMonth()+1));
		System.out.println("년도"+(myDate.getDate()));
		System.out.println(( weekNum==0?"일":weekNum==1?"월":weekNum==2?"화":weekNum==3?"수":weekNum==4?"목":weekNum==5?"금":"토"));
	
	
	
	}

}
