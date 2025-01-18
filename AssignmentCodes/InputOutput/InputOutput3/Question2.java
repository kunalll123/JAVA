import java.util.*;

class ScannerDemo2{
	public static void main(String[] args){

		boolean var1=false;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value for var1: ");
		var1=sc.nextBoolean();
	
		int count=0;
		int num=1;

		while(var1){
			if(count<=num)
			{
			System.out.println(++num);
			}
			if(count==10){
				break;
			}
		}
	}
}

