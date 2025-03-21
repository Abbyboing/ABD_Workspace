package com.Language_Fundamentals;

public class Literals {
	public static void main(String[] args) {
		//A constant value which can be assigned to a variable is called literals.
		
		int x=10; //(10 is constant value or literals)
		
//		Decimal form (base10): Allowed digits are 0 to 9.
		int a=10;
		System.out.println("Int value : "+a);
		
//		Octal form (base 8): allowed digits are 0 to 7. Literals value should be prefixed with 0.
		int b=070;
		System.out.println("Octal value : "+b);
		
//		Hexadecimal Form (base 16): Allowed digits are 0 to 9 , a to f , for extra digits a to f we can use both lower case and upper case character. 
//		This is very few areas where java is not case sensitive. The literals value should be prefixed with 0x or 0X allowed.
		int c=0x11;
		System.out.println("Hexadecimal value : "+c);
		
//		Binary Form (bits): Only in the form of 0s and 1s
		int d=0b11;
		System.out.println("Binary value : "+d);
		
//		By default every integrals literals is of int type but we can specify explicitly as long type by suffixed with small l or capital L.
		long l=10L;
		long m=010L;
		long n=0x10L;

//		char ch = 0x40;
		char ch = '\u0040';
		System.out.println("Character : "+ch); 
		System.out.println("Character : "+ch); 
		
	}
}
