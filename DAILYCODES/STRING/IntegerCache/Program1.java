class JvmInternal{
	public static void main(String[] args){

		int x=10;
		int y=10;
		int z=10;
		
	
			   
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		

		int a=128;  //IntegerCache Range -128 to 127
		int b=128;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
