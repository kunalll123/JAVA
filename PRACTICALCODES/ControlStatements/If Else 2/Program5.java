import java.util.Scanner;

class Student{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the value: ");
	float value=sc.nextFloat();

	if(value%6==0){
		System.out.println("Value is Divisible by 6:" + value);
	}else{
		System.out.println("Value is not Divisible by 6:" + value);
		}
	}
}
