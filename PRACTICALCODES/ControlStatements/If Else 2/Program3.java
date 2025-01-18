import java.util.*;
class VowelsConsonantChecker{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character: ");
	char ch=sc.next().charAt(0);
	
	if(isVowel(ch)){
	
		System.out.println(ch + "is a vowel");
		}else{
			System.out.println(ch + "is a consonant");
		}
	}
}