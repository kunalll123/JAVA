import java.util.*;

class Question10{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();

		char ch[]=new char[size];
		for(int i=0;i<ch.length;i++){
			ch[i]=sc.next().charAt(0);

		}
		char shabd=sc.next().charAt(0);
		for(int i=0;i<ch.length;i++){
			if(ch[i]==shabd){
				break;
			}
			else{
				System.out.println(ch[i]);
			}
		}
	}
}

