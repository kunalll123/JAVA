import java.io.*;
class Question9{
	public static void main(String []args)throws IOException{
	
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());


		char arr[]=new char[size];

		System.out.println("Enter the elements: ");

		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine().charAt(0);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>='a' && arr[i]<='z'){
			
			}
			else{
				arr[i]='#';
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}


