import java.util.*;

class ScannerDemo8{
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		int x=1;

		while(x<=4){
			int j = 1;
			while(j<=4){
				System.out.print(str+"\t");
				j++;
			}
			System.out.println();
			x++;
		

		}
	}
}

