import java.io.*;
class Question3{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		int arr2[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[arr.length-1-i];
		}
		int count=0;
		for(int i=0;i<size;i++){	
			if(arr[i]==arr2[i]){
			
			}
			else{
				count++;
			}
		}
		if(count==0){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}


