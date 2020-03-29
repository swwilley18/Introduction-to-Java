import java.util.Scanner;

public class Exercise12_9 {
	public static void main(String[] args) {
		//create a Scanner
		Scanner input=new Scanner(System.in);
		
		//Prompt user to enter a string
		System.out.print("Enter a binary number: ");
		//store input from user
		String bin=input.nextLine();
		//output results after conversion
		System.out.print("The decimal value for binary number " + bin + " is " + binToDecimal(bin.toUpperCase()));
				
	}
	
	//method tries to convert a binary number into a decimal number
	public static int binToDecimal(String bin) throws BinaryFormatException {
		//try to perform the conversion
		try {
			int decimalValue=0;
			//convert binary value to a decimal
			//if operation cannot be performed throws exception
			decimalValue=Integer.parseInt(bin, 2);
			//return value to main method for output
			return decimalValue;
		}
		//intercept NumberFormat Exception
		catch (NumberFormatException ex) {
			//create exception and exception message and swap with NumberFormatException
			throw new BinaryFormatException("ERROR BinaryFormatException: " + bin + " is not binary");
			
		}
	}
}

//new class to create and define BinaryFormatException
class BinaryFormatException extends IllegalArgumentException{
	//BinaryFormatException method
	BinaryFormatException(String s){
		//create an error message for new exception method
		//error message is the invalid string
		super(s);
	}
}
