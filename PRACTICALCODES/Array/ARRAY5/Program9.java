import java.io.*;

class Question9{
	public static void main(String []args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			arr[i]+=1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
}


