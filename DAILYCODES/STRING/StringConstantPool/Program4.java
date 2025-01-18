class StringDemo4{
	public static void main(String[] args){

		String str1="shashi";  //100
		String str2="Core2web";  //200
		String str3=new String("shashi");  //300
		String str4="shashiCore2web";  //400

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

