import java.util.*;

class ifelseDemo1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int num=sc.nextInt();

	if(num%2==1){
		System.out.println("No is odd: " + num);
		}else{
			System.out.println("No is even" +num);
		}
	}
}