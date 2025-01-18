class UnaryOp4{
	public static void main(String[] args){
	
	int x=25;
	int y=35;
	
	int ans = ++x + y++ + x++;
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(ans);
	
	}
}