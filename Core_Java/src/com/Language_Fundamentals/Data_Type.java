package com.Language_Fundamentals;

public class Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive Data type (8)
		
		1 Byte = 8 Bits
		
		Size(Byte), Range, Wrapper classes, Default value
		
		Non-Numeric (unsigned data types):
			
			boolean (NA [VM Dependant], NA but default value is true or false, Boolean, false)
			char (2, 0 to 65535, Character, 0 (meaning space))
			
		Numeric:
			
			Integeral (signed data types):
				
				byte (1, -128 to 127, Byte ,0) //Two types of streams. Character Stream and Byte Streams. Byte is the best choice if you want to handle data in term of streams either from file or from network (File supported form, network supported form is byte).
				short (2, -32768 to 32767, Short, 0) //Short data types is best suitable for 16 bit processor like 8085 but this processors are completely outdated and hence corresponding short data type also out dated data type.
				int (4, -2147483648 to 2147483647, Integer, 0) //The most commonly used data type in java is int.
				long (8, -2(63) to 2(63)-1, Long, 0) //Sometimes int may not be enough to hold big values then we should go for long type.
				
			Floating:
				
				float (4, -3.4e38 to 3.4e38, Float, 0.0) //Single precision
				double (8, -1.7e308 to 1.7e308, Double, 0.0) //Double precision
				
				
		//Null is default value for the object reference and we can’t applied for primitives. If we are trying to use for primitives we will get compile type error.
				
		
	}

}
