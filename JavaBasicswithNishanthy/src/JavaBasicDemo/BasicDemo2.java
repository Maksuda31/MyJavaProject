package JavaBasicDemo;

import java.util.Scanner;

public class BasicDemo2 {
//	151. Write a Java program to find the value of a specified expression.
//	a) 101 + 0) / 3
//	b) 3.0e-6 * 10000000.1
//	c) true && true
//	d) false && true
//	e) (false && false) || (true && true)
//	f) (false || false) && (true && true)
//
//	Expected Output :
//	(101 + 0) / 3)-> 33
//	(3.0e-6 * 10000000.1)-> 30.0000003
//	(true && true)-> true
//	(false && true)-> false
//	((false && false) || (true && true))-> true
//	(false || false) && (true && true)-> false
	
/*	public static void main(String[] args) {
		int a= (101+0)/3;
		System.out.println(a);
		
		double b=(3.0e-6)*10000000.1;
		System.out.println(b);
		boolean c= true && true;
		System.out.println(c);
		boolean d=false && true;
		System.out.println(d);
		boolean e=(false && false) || (true && true);
		System.out.println(e);
		boolean f=(false || false) && (true && true);
		System.out.println(f);
	}*/

	
//152. Write a Java program that accepts four integers from the user and 
//prints equal if all four are equal, and not equal otherwise.
//Sample Output:
//Input first number: 25
//Input second number: 37
//Input third number: 45
//Input fourth number: 23
//Numbers are not equal!	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);	
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=sc.nextInt();
//		int num4=sc.nextInt();
//		System.out.println("Four integers are :"+num1+","+ num2+","+ num3+","+num4);
//		
//		if(num1==num2 && num2==num3 && num3==num4){
//		System.out.println("Numbers are equal");
//		}
//		else{
//		System.out.println("Numbers are not equal");
//	}
//153. Write a Java program that accepts two double variables 
//	   and test if both strictly between 0 and 1 and false otherwise.
//	   Sample Output:Input first number: 5, Input second number: 1

//	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	double a=sc.nextDouble();
//	double b= sc.nextDouble();
//	
//	System.out.println(a>0&&b<1 && b>0 &&a<1);
//	}
//	154. Write a Java program to print the contents of a two-dimensional Boolean array 
	//where t represents true and f represents false.
//	Sample array:array = {{true, false, true},{false, true, false}};
//	Expected Output :
//	t f t
//	f t f	
	
	public static void main(String[] args) {
	boolean[][]array= {{true, false, true},{false, true, false}};
	
	int row_length=array.length;
	int column_length= array.length;
	for (int i=0; i<row_length; i++) {
		for (int j=0; j<column_length; j++) {
			if (array[i][j])
			{
				System.out.println("t");
			}
			else {
				System.out.println("f");
			}
				}
			}
	}
	
}
