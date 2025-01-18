import java.io.*;

class Pattern9{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());

		
		for(int i=1; i<=row; i++){
		
			for(int j=1; j<=row; j++){
				if(i % 2 == 1){
					if(j % 2 == 1){
						System.out.print(2*j + " ");
					}else{
						System.out.print(3*j + " ");
						}
					}
					else{
	
					if(j%2 == 0){
						System.out.print(2*j + " ");
					}else{
						System.out.print(3*j + " ");
						}
					}
				}
			
			System.out.println();
		}
	}
}

