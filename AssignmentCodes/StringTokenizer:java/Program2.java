import java.util.*;

class Demo2{
	public static void main(String[] args){
			
		String str="core 2 web";
		
		StringTokenizer strtoken = new StringTokenizer(str,"");

		while(strtoken.hasMoreTokens())

			System.out.println(strtoken.nextToken()+",");
		System.out.println();
	}
}

