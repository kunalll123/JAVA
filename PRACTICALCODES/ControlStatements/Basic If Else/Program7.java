import java.util.Scanner;
	
class DistinctNo{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the First Number: ");
	int FirstNumber=sc.nextInt();
	
	System.out.println("Enter the Second Number: ");
	int SecondNumber=sc.nextInt();
	
	if(FirstNumber > SecondNumber){
		System.out.println("Maximum Number: " + FirstNumber);
	}else if(SecondNumber > FirstNumber){
		System.out.println("Maximum Number: " + SecondNumber);
	}else{
		System.out.println("Both are equal: ");
		}
	}
	
}
	