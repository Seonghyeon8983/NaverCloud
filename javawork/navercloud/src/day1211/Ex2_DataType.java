package day1211;

public class Ex2_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90;
		int eng = 93;
		System.out.println("합계="+kor+eng);// string+int+int :묵시적 형변환에 의해서 string+int=string
		//int+int=int 이므로 먼저 계산을 해야만 한다 
		System.out.println("합계="+(kor+eng));
		
		//진법변환
		int a = 056;//8진수로 인식
		int b = 0x12a;//16진수로 인식
		System.out.println("a="+a);//8진수를 10진수로 변경 5*8+6*1=46
		System.out.println("b="+b);//16진수를 10진수로 변경 1*16의 2승+2*16의 1승 10*16의 0승 = 298
	
		
		int c = 047;
		int d = 0xa9;
		System.out.println("c="+c);
		System.out.println("d="+d);
	
	}

}
