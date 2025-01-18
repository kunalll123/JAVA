import java.util.*;

class Question6{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of characters in array: ");
		int size=sc.nextInt();

		char[] ch=new char[size];

		System.out.println("Enter characters: ");


		for(int i=0; i<size; i++){
			ch[i]=sc.next().charAt(0);
		}

		for(int i=0; i<size; i++){
			System.out.println(ch + " ");
		}
	}
}


