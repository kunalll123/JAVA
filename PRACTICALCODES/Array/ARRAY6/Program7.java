import java.io.*;
class Question7{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
		System.out.println("Enter the size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.println((char)arr[i]);
			}
			else{
				System.out.println("Arrays will be like: "+arr[i]);
			}
		}
	}
}

