import java.util.*;
class Question4{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int cnt=0;	
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("First duplicate element present at index "+arr[i]);
					cnt++;
					break;
					
				}
			}
			if(cnt==1){
				break;
			}
		}
	}
}

