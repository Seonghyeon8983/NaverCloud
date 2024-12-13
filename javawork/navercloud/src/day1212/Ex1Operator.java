package day1212;

import java.nio.file.FileSystemNotFoundException;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자 ++ 변수(전치 1 순위), 변수 ++ (후치:끝순위)
		int a,b,m,n;
		a=b=5;
		m=++a;
		n=b++;
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
		
		a=b=m=n=5;
		m=a++*++b;
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,n,m);
		
		n=a+++ ++b;
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,n,m);
		
		a=5;
		System.out.println(a++);
		System.out.println(++a);
			
	}

}
