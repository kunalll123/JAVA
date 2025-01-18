import java.util.*;

class ScannerDemo7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter float value: ");
		float floatVal=sc.nextFloat();

		System.out.println("ENter double value: ");
		double doubleVal=sc.nextDouble();

		System.out.println("ENter int value: ");
		int intVal=sc.nextInt();

		System.out.println("Addition is :" );
		doubleVal = floatVal + doubleVal + intVal;

	System.out.println(doubleVal);	
	}
}

