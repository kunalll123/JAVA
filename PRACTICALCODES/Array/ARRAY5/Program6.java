import java.io.*;

class Question6{
	public static void main(String []args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			int num=arr[i];
			while(num>0){
				if(arr[i]%num==0){
					count++;
				}
				num--;
			}
			if(count==2){
				System.out.println("First Prime Number is "+arr[i]);
				break;
			}
		}
	}
}

