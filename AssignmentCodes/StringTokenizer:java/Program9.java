import java.util.*;

class Demo9{
	public static void main(String[] args){
			
		
		
		String str="235624582265892";
		
		StringTokenizer strtoken=new StringTokenizer(str,"2");

		while(strtoken.hasMoreTokens()){

			System.out.println(strtoken.nextElement());
		}
	}
}


