import java.io.*;

class Question6{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter a Key");
		
		int key=Integer.parseInt(br.readLine());
		
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%key==0){
				System.out.println("An Element multiple of "+key+" found in index "+i);
				count++;
			}
		}
		if(count==0){
			System.out.println("Element not found");
		}
		
		else if(count==1){
			System.out.println("No Multiples");
		}
	}
}

