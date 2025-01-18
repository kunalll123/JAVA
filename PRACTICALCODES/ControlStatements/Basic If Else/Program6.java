import java.util.Scanner;

class NoDivisible1{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number");
	
	int num=sc.nextInt();

	if(num%7==0){
		System.out.println(num + "Divisible by 7");
	}else if(num%3==0){
		System.out.println(num +" Divisible by 3");
		}else{
			System.out.println(num +" Neither Divisible by 3 or 7");
		}
	}
}