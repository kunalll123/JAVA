import java.util.*;

class Demo3{
	public static void main(String[] args){
			
		

		String str="truefalse";
		
		StringTokenizer strtoken=new StringTokenizer(str,"");

		while(strtoken.hasMoreTokens()){
			boolean b=Boolean.parseBoolean(strtoken.nextToken());
			System.out.println(b);
		}
	}
}

