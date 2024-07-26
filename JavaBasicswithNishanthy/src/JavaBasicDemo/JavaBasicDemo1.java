package JavaBasicDemo;

import java.util.Scanner;

public class JavaBasicDemo1 {

	public static void main(String[] args) {
//1. Write a Java program to print 'Hello' on screen and your name on a separate line.
	System.out.println("Hello");	

	
//2.Write a Java program to print the sum of two numbers.
	int a=74;
	int b=36;
	System.out.println(a+b);
//3.Write a Java program to divide two numbers and print them on the screen.
	int x=50;
	int y=3;
	System.out.println(x/y);
//4. Write a Java program to print the results of the following operations.
//	a. -5 + 8 * 6
//	b. (55+9) % 9
//	c. 20 + -3*5 / 8
//	d. 5 + 15 / 3 * 2 - 8 % 3	
	System.out.println(-5 + 8 * 6);
	
	System.out.println((55+9) % 9);
	
	System.out.println(20 + -3*5 / 8);
	
	System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//	Test Data:Input first number: 25,Input second number: 5;Expected Output :25 x 5 = 125
		
//	Scanner sc= new Scanner(System.in);
//	
//	System.out.println("Input First Number");
//	int sc1= sc.nextInt();
//	System.out.println("Input Second Number");
//	int sc2=sc.nextInt();
	
//	System.out.println(sc1+"*"+sc2+"="+sc1*sc2);
//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//	Test Data:
//		Input first number: 125
//		Input second number: 24
//		Expected Output :
//		125 + 24 = 149
//		125 - 24 = 101
//		125 x 24 = 3000
//		125 / 24 = 5
//		125 mod 24 = 5	
//	Scanner input= new Scanner(System.in);
//	System.out.println("6 First Number");
//	int input1=input.nextInt();
//	System.out.println("6 Second Number");
//	int input2=input.nextInt();
//	//Addition
//	System.out.println(input1+"+"+input2+"="+(input1+input2));
//	//125 - 24 = 101
//	System.out.println(input1+"-"+input2+"="+(input1-input2));
//	//125 x 24 = 3000
//	System.out.println(input1+"*"+input2+"="+(input1*input2));
//	//125 / 24 = 3000
//	System.out.println(input1+"/"+input2+"="+(input1/input2));
//	//125 mod 24 = 3000
//	System.out.println(input1+"mod"+input2+"="+(input1%input2));

//7. Write a Java program that takes a number as input and 
//	prints its multiplication table up to 10.
//	Test Data:
//		Input a number: 8
//		Expected Output :
//		8 x 1 = 8
//		8 x 2 = 16
//		8 x 3 = 24
//		...
//		8 x 10 = 80	
//	Scanner m= new Scanner(System.in);
//	System.out.println("Input a number");
//	int number=m.nextInt();
//	
//	for(int i=1; i<21; i++) {
//		System.out.println(number+"*"+i+"="+(number*i));
//	}

//8. Write a Java program to display the following pattern.
//	Sample Pattern :
//
//		   J    a   v     v  a                                                  
//		   J   a a   v   v  a a                                                 
//		J  J  aaaaa   V V  aaaaa                                                
//		 JJ  a     a   V  a     a	

	System.out.println("J      a   v     v  a");
	System.out.println("J     a a   v   v  a a");
	System.out.println("J  J  aaaaa  V V  aaaaa");
	System.out.println(" JJ   a   a   V  a     a");
	
//9. Write a Java program to compute the specified expressions and print the output.
//	Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//		Expected Output
//		2.138888888888889	
	
	System.out.println(((25.5*3.5)-(3.5*3.5))/(40.5-4.5));
//10. Write a Java program to compute a specified formula.
//	Specified Formula :
//		4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//		Expected Output
//		2.9760461760461765	
	System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
	
//11. Write a Java program to print the area and perimeter of a circle.
//	Test Data:
//		Radius = 7.5
//		Expected Output
//		Perimeter is = 47.12388980384689
//		Area is = 176.71458676442586	

	double radius=7.5;
	double pi=3.14159;
	
	System.out.println("The perimeter of a circle is "+(2*radius*pi));
	System.out.println("The area of a circle is "+pi*radius*radius);
//	12. Write a Java program that takes three numbers as input 
//	to calculate and print the average of the numbers.	
	
//	Scanner Avg= new Scanner(System.in);
//	System.out.println("Input 3 numbers");
//	int a1= Avg.nextInt();
//	int a2= Avg.nextInt();
//	int a3= Avg.nextInt();
//	
//	System.out.println("Average of 3 numbers is "+ (a1+a2+a3)/3);

//13. Write a Java program to print the area and perimeter of a rectangle.
//	Test Data:Width = 5.5 Height = 8.5	

	double width=5.5;
	double height=8.5;
	
	double area=width*height; 			//5.5*8.5=46.75
	double perimeter=2*(width+height);	//2*(5.5*8.5)=28
	
	System.out.println(perimeter);
	System.out.println(area);

//15. Write a Java program to swap two variables.
 
//	int m =5;
//	int n=10;
// 
// System.out.println("Before Swaping m, n: m+" + m+", n="+n);
//
// 	int temp=m;
// 	m=n;
// 	n=temp;
// 
// System.out.println("After Swaping m, n: m="+m+",n= "+n);	

	
	
	
	}

}
