import java.io.*;
class Question4{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
	
		int arr1[]=new int[size];
	
		System.out.println("Enter first arr");
	
		for(int i=0;i<size;i++){
			arr1[i]=Integer.parseInt(br.readLine());
	
		}
	
		int arr2[]=new int[size];
		
		System.out.println("Enter second arr");
		
			for(int i=0;i<size;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}


