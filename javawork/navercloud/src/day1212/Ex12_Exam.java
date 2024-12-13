package day1212;

import java.util.Scanner;

public class Ex12_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 이름과 java html spring 의 3 과목 점수를 입력받은후
		 * 총점 과 평균 등급 합격여부를 출력하시오 
		 * 등급은 평균이 90 이상이면 "우등장학생", 80이상이면 "50프로 장학금" 나머지는 "노력"이라고 출력
		 * 
		 * 합격여부는 3과목이 50이상이고 평균이 70 이상이면 합격입니다
		 * 나머지는 불합격입니다 라고 출력 (출력문에서 직접 조건연산자로 출력하기) 
		 * 
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		
		String name;
		int java ,html ,spring;
		
		System.out.println("이름을 입력하십시오");
		name= sc.nextLine();
		
		System.out.println("java 점수 입력");
		java=sc.nextInt();
		System.out.println("html 점수 입력");
		html=sc.nextInt();
		System.out.println("spring 점수 입력");		
		spring=sc.nextInt();
		
		
		int total= java+html+spring;
		double avg= total/3;
		
		System.out.println("자바점수"+java);
		System.out.println("html점수"+java);
		System.out.println("스프링점수"+java);
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+avg);
		
		System.out.println("당신은 "+(avg>=90?"우등장학생":avg>=80?"성적장학금":"노력")+" 입니다");
		System.out.println((java>=50 && html>=50 && spring>=50 && avg>=70?"합격":"불합격입니다")   );
		
	}

}
