import java.util.*;

class Pattern3{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		int col=0;
		
		for(int i=1; i<=row*2; i++){
				
			if(i<=row){
				col++;
			}
			else{
				col--;
			}

			int num=col;
			for(int j=1; j<=col; j++){

				System.out.print(num +"\t");
				num--;
			}
			
			System.out.println();
		}
	}
}

