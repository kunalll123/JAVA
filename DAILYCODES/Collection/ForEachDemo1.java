import java.util.*;

class ForEachDemo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		ArrayList <String> al=new ArrayList <String>();

		al.add("Shashi");
		al.add("kanha");
		al.add("badhe");
		al.add("Rahul");
		al.add("Ashish");
		al.add("Shashi");
		al.add("kanha");

		int count=0;

		for(String x:al){
			
			if(str == x){
				count++;
			}else{
				System.out.println(al);
			}
		}
		System.out.println("count :" + count);
	}
}
