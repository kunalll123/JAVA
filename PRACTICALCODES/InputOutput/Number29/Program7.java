import java.util.*;
class HappyNo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int sum2=0;
		int rem=0;
		while(temp!=1 && temp!=4){
			sum2=0;
			while(temp>0){
				rem=temp%10;
				sum=rem*rem;
				sum2=sum2+sum;
				temp/=10;
			}
			temp=sum2;
		}
		if(sum2==1){
			System.out.println("Happy Number");
		}
		else if(sum2==num){
			System.out.println("Unhappy Number");
		}
		
	}
}

