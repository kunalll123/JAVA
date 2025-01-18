import java.io.*;

class Pattern8{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());
	

		for(int i=1; i<=row; i++){
			char num=(char)(64+row);

			for(int j=1; j<=row; j++){
				if(i%2 == 1){
					if(j%2 == 1){
						System.out.print("#" + " ");
					}else{
						System.out.print(num-- + " ");
					}
				}
				else{

				if(j%2 == 0){
		
					System.out.print("#" + " ");
					
				}else{
					System.out.print(num-- + " ");
					}
				}
			}
			
		System.out.println();
		}
	}
}

