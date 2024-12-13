package day1211;

public class Ex9_Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		이상욱
		삼성전자
		홍보부
		89
		100
		74
		*/
		System.out.println("외부에서 값 읽어오기");
		String name=args[0];//이름
		String name2=args[1];//회사
		String name3=args[2];//부서
		
		int Score1=Integer.parseInt(args[3]);
		int Score2=Integer.parseInt(args[4]);
		int Score3=Integer.parseInt(args[5]);
		
		int total=Score1+Score2+Score3;//총점
		double average=total/3.0;//평균
		
		
		System.out.println("이름 :"+name);
		System.out.println("회사 :"+name2);
		System.out.println("부서 :"+name3);
		
		System.out.println("Score1 :"+Score1);
		System.out.println("Score3 :"+Score2);
		System.out.println("Score2 :"+Score3);
		System.out.println("총점 :"+total);
		System.out.printf("평균점수 :%.1f",average);
		
		
		
		
		
	}

}
