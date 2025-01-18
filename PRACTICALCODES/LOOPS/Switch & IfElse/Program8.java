import java.util.Scanner;
	
class CheckNO{

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the  first Number: ");
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number: ");
	int num2=sc.nextInt();
	
	if(num1<0 || num2<0){
			System.out.println("Sorry negative numbers are not allowed");
		}else{
			int X=num1*num2;
			System.out.println(X);
			
			switch(X){
				
				case 0:
					System.out.println("X is odd : " + X);
					break;
		
				case 1:
					System.out.println("X is odd : " + X);
					break;
				}
			}
	}
}
		
