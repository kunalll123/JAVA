import java.util.*;

class Pattern4{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		int col2=row+1;
		int col=0;
	
		for(int i=1; i<=row*2; i++){
			
			if(i<=row){
				col++;
				col2--;
			}
			else{
				col--;
				col2++;
			}

			
			for(int j=1; j<=col; j++){

				System.out.print(col2+"\t");
			
			}
			
			System.out.println();
		}
	}
}

