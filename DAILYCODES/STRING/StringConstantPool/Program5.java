class StringDemo5{
	public static void main(String[] args){

		String str1="shashi";  
		String str2="Core2web";    
		String str3="shashiCore2web";
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}


