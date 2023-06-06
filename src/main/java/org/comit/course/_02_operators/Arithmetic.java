package org.comit.course._02_operators;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =8;
		int b = 3;
		 
		int sum=a+b;
		int sub=a-b;
		int mul = a*b;
		double div = (double)a/b;
		int mod= a%b;
		
		System.out.println("Addition :"+sum);
		System.out.println("Subtraction :"+sub);
		System.out.println("multiplication :"+mul);
		System.out.println("Divition :"+div);
		System.out.printf("Divition : %.2f \n ",div);
		System.out.println("MOD :"+mod);
	}

}
