import java.util.Scanner;

class NoDivisible{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number");
	
	int num=sc.nextInt();

	if(num%7==0){
		System.out.println(num + "Divisible by 7");
	}else {
		System.out.println(num +"Not Divisible by 7");
		}
	}
}