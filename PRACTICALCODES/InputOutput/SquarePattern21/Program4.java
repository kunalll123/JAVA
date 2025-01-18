import java.io.*;

class Pattern4{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());

		int ch=row;
	

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(ch % row == 0){
				
				System.out.print((char)(64+ch) + " ");
				ch++;
			}else{
				System.out.print(ch + " ");
				ch++;
			}
			}
			System.out.println();
		}
	}
}

