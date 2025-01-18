import java.util.Scanner;
	
class DivisibleNo{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Number: ");
	int Number=sc.nextInt();
	
	
	
	if(Number%2==0 && Number%5==0 && Number%10==0){
		System.out.println("Number is divisible by 2,5,10: " + Number);
	}
	else{
		System.out.println("Number is not divisible by 2,5,10: " + Number);
		}
	}
}
		