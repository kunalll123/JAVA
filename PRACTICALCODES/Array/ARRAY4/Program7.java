import java.io.*;
class Question7{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine().charAt(0);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=97){
				arr[i]-=32;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print((char)arr[i] + " ");
		}
	}
}
	
