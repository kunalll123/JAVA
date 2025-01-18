import java.io.*;

class Pattern7{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());

		char ch=65;
		int num=row;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(num%2 != 0){
		
					System.out.print(ch + " ");
					num++;
			}else{
				System.out.print(num + " ");
				num++;
			}
			}
			ch++;
			System.out.println();
		}
	}
}

