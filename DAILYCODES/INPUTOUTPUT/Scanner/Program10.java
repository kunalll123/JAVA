import java.util.*;

class ReverseTable{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number :");
		int num=sc.nextInt();

		for(int i=10; i>0;i--){
			System.out.print(num*i + " ");

		}
	}
}
