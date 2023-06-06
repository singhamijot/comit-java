package org.comit.course._02_operators;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b=8;
		
		boolean equalTo= a==b;
		boolean notEqual= a!=b;
		boolean greaterThan= a>b;
		boolean greaterThanEqual= a>=b;
		boolean lessThan= a<b;
		boolean lessThanEqual= a<=b;
		

		System.out.println(" Equal to:"+ equalTo);
		System.out.println(" Not Equal to:"+ notEqual);
		System.out.println(" Greater Than:"+ greaterThan);
		System.out.println(" Greater than Equal:"+ greaterThanEqual);
		System.out.println(" Less than:"+ lessThan);
		System.out.println(" Less Than Equal to:"+ lessThanEqual);
		
		if(greaterThan)
		{ System.out.println("a is greater than b");
	}else if(equalTo)
	{
		 System.out.println("a is equal to  b");	
	}else
	{  System.out.println("a is smaller than b");
}
	}}
