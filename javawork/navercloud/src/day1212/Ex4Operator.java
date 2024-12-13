package day1212;

public class Ex4Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int kor=89,eng=100,mat=89;
		boolean f=false;
		
		System.out.println(kor>eng);//false
		System.out.println(kor<eng);//true
		System.out.println(kor==eng);//true
		System.out.println(kor!=eng);//false
		System.out.println(kor>eng&& ++eng>mat);//false false&&true :1번쨰 조건이 false 일 경우 두번째 조건은 비교하지 않는다
		System.out.println(eng);//100
		System.out.println(kor>eng||++eng>mat);//true flase||true : 1번쨰 조건이 true 일 경우 두번쨰 조건은 비교하지 않는다
		System.out.println(eng);//101 위에서 1번쨰 조건이 flase이기 때문에 뒤에 조건을 실행하여 증감 연산자가 적용이 되었다
		
		System.out.println(!(kor>eng));//true
		System.out.println(!f);		//true
	}

}
