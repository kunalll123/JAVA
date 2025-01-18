class Demo{
	public static void main(String[] args){

		int x=295;
		int y=95;
		int z=295;
		int q=95;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(q));
	}
}
