class SbDemo{
	public static void main(String[] args){

		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
		
		sb=sb+"sonawane";		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());




	}
}
