import java.util.*;

class Pattern10{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row: ");
		int row=sc.nextInt();
		
		
		for(int i=1; i<=row; i++){
		
			char ch=(char)(65+(row-i));

			for(int j=1; j<=row-i+1; j++){
				if(i % 2 != 0){
				System.out.print(j +" ");
			}else{
				System.out.print(ch-- + " ");
			}
			}
			
			System.out.println();
		}
	}
}


