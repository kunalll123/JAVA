import java.io.*;
class Question1{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the size of the array: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>=arr[i+1]){

			}
			else{
				count++;
			}
		}
		if(count==0){
			System.out.println("Descending Order");
		}
		else{
			System.out.println("Not Descending Order");
		}
	}
}

