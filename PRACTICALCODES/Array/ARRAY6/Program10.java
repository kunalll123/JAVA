import java.io.*;
class Question10{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<=arr[i]){
				max=arr[i];
			}
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>=arr[i]){
				min=arr[i];
			}
		}

		int scMax=min;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max && arr[i]>scMax){
				scMax=arr[i];
			}
		}
		int tMax=min;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<scMax && arr[i]>tMax){
				tMax=arr[i];
			}
		}
		System.out.println("Third max is "+tMax);
	}
}

