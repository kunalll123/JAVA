class StringDemo3{
	public static void main(String[] args){

		String str1="shashi";
		String str2="Core2web";
		String str3="shashi";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		String str4=new String("shashi");
		String str5=new String("Core2web");
		String str6=new String("shashi");

		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}
