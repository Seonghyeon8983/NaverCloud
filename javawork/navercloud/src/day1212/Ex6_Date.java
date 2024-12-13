package day1212;

import java.util.Date;

public class Ex6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 날짜와 시간을 얻어보자
		//Date 클래스는 jdk1.1 이후에 deprecate됨 -Caledat를 권장
		Date today= new Date(); 
		
		int curYear=today.getYear();
		int curMonth=today.getMonth();
		int curDate=today.getDate();
		
		System.out.println("현재년도:"+curYear);//현재 년도에서 1900을 뺸값을 반환하므로 +1900
		System.out.println("현재 월:"+curMonth);//0~11을 반환하므로 +1을 해야함
		System.out.println("현재 일:"+curDate);
		
		
		curYear+=1900;
		curMonth+=1;
		
		System.out.println("현재 년도:"+curYear);
		System.out.println("현재 월:"+curMonth);
		System.out.println("현재 일:"+curDate);

		System.out.println(today.getHours()+"시"+today.getMinutes()+"분");
		
		//요일 숫자구하기 (0~6: 일~토)
		int weekDay=today.getDay();
		System.out.println(weekDay);
		
		//오늘은 목요일입니다
		String week= weekDay>5?"토":weekDay>4?"금":weekDay>3?"목":
			weekDay>2?"수":weekDay>1?"화":weekDay>0?"월":"일";
		System.out.println("오늘은:"+week+"요일입니다");

		
	}

}
