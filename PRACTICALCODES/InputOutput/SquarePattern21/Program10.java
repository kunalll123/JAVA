
import java.io.*;

class Pattern10{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());
		

		
		for(int i=1; i<=row; i++){
		int num=row;		
			for(int j=1; j<=row; j++){
				if(i % 2 == 1){
					if(j % 2 == 1){
						System.out.print(num + " ");
					}else{
						System.out.print((char)(64+num) + " ");
						}
					}
					else{
						System.out.print((char)(64+num) + " ");
					}
					num--;
			}
			
			System.out.println();
		}
	}
}

