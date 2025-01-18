import java.util.*;

class Question9{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str=sc.next();

		int ln=str.length;
		int count=0;

		while(ln > 0){
			count++;
			ln--;
		}

		if(count==0){
			System.out.println(str.lastIndexOf('b',7));
		}else{
			System.out.println(count-1);
		}
	}
}
