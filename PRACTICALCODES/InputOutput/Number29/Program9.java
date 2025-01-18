import java.util.*;
class P9{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp>0){
			rem=temp%10;
			sum=sum+rem;
			temp/=10;
		}
		if(num%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not Harshad Number");
		}
	}
}


