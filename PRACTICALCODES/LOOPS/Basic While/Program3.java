class NoDivisible{
	public static void main(String[] args){
	
	int x=100;
	int y=50;

	while(x >= y){
		if(x%4==0 && x%7==0 ){
			System.out.print(x+ " ");
		}
		x--;
		}
	}
}