package day1212;

public class Ex2Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su1=10;
		int su2=4;
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);
		System.out.println(su1%su2);
		System.out.println((double)su1/su2);
		System.out.println(su1/(double)su2);
		System.out.println("----------------");
		int money=3456789;
		
		System.out.println("rmador :"+money+"원");
		System.out.println("만원 :"+money/10000+"장");
		System.out.println("천원 :"+money%10000/1000+"장");
		System.out.println("오백원 :"+money%1000/500+"장");
		System.out.println("백원 :"+money%500/100+"개");
		System.out.println("십원 :"+money%100/10+"개");
	}

}
