import java.util.*;
class automorphicNo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int count=0;
		int temp=num;
		while(temp>0){
			int rem=0;
			rem=temp%10;
			temp/=10;
			count++;
		}
		int rem=0;
		int rev=0;
		int square=num*num;
		while(count>0){
			rem=square%10;
			rev=rem+rev*10;
			square/=10;
			count--;
		}
		int auto=0;
		while(rev>0){
			rem=rev%10;
			auto=rem+auto*10;
			rev/=10;
		}
		if(num==auto){
			System.out.println("Automorphic");
		}
		else{
			System.out.println("Not Automorphic");
		}
	}
}



