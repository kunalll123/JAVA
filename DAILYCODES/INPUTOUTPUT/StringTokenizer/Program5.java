import java.util.*;

class SingleLine{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Player Info");
		String info=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(info,",");
		
		String str1=st.nextToken();
		String str2=st.nextToken();
		String str3=st.nextToken();
		String str4=st.nextToken();

		System.out.println("PlayerName : "+ str1);
		System.out.println("JerNo : "+ str2);
		System.out.println("Average : "+ str3);
		System.out.println("Grade : "+ str4);
	}
}
