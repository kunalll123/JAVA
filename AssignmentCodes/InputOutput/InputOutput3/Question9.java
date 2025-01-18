import java.util.*;

class ScannerDemo9{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int rows=sc.nextInt();
		int i=1;
		while(i<=rows){
			int j=1;
			while(j<rows){
				System.out.print((char)(96+i)+"\t");
				j++;
			}
			System.out.println();
			i++;

		}
	}
}

