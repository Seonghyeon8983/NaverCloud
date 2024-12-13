package day1211;

public class Ex4_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		int month=12;
		int day=11;
		
		int year2=2024;
		int month2=5;
		int day2=3;
		
		
		System.out.println(year+"-"+month+"-"+day);
		
		//printf를 이용해서 위와 같이 출력해보기: 정수는 변환기호가 %
		System.out.printf("%d-%d-%d\n",year2,month2,day2);
		
		System.out.println(year2+"-"+month2+"-"+day2);// 2024-5-3
		
		System.out.printf("%d-%02d-%02d\n",year2,month2,day2);
		
		int money=23456000;
		System.out.printf("이번달 급여 = %10d원\n",money);//오른쪽 정렬
		System.out.printf("이번달 급여 = %-10d원\n",money); //왼쪽 정렬
	
	
	}

}
