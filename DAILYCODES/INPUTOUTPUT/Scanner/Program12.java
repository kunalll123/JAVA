import java.util.*;

class RangeEven{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1=sc.nextInt();

		System.out.println("Enter the second number:");
		int num2=sc.nextInt();

		for(int i=-2; i<=5; i++){
			if(i%2==0){
				System.out.println(i + " ");
				i++;
			}
		}
	}
}
