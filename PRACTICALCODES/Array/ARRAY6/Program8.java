import java.io.*;
class Question8{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
	
		char arr[]=new char[size];
	
		System.out.println("Enter the elemnets: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine().charAt(0);
		}
		for(int i=0;i<arr.length/2;i++){
			char temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

