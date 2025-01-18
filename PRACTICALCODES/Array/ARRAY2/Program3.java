import java.util.*;

class Question3{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();

		char arr[]=new char[size];

		System.out.println("Enter elements :");
		for(int i=0; i<size; i++){
			arr[i]=sc.next().charAt(0);
		}
		
		boolean isVowel=false;
		for(int i=0; i<size; i++){
			if(isVowel(arr[i])){
				System.out.println("vowels found at index" + arr[i] + "is: " +i);
			}else{
				System.out.println("vowels not fount : ");
			}
		}
	}
}
