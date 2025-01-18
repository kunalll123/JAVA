import java.util.*;

class ScannerDemo6{
	static int num=10;
	public static void main(String[] args){

		int var1 = 0;

		Scanner sc=new Scanner(System.in);

		var1 = sc.nextInt();

		while(var1>0 && num<=50){

		System.out.println(num--);
		num+=2;
		var1--;
		}
		System.out.println(num);
	}
}

