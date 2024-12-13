public class Apple
{ 
	public static void main(String[]args)
	{
		System.out.println("Apple");
		System.out.println("banana");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[0]+args[1]+args[2]);


		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		int su3 = Integer.parseInt(args[2]);


		System.out.println("두 수의 합은"+(su1+su2+su3)+"입니다");
				
	}	
}
