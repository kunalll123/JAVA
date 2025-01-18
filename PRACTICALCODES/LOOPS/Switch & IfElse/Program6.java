import java.util.Scanner;
	
class CheckNo{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	
	switch(num){
	
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		
		case 2:
			System.out.println("TWO");
			break;
		
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		
		default:
			System.out.println("Number is greater than 5");
			break;
		}
	}
}
		