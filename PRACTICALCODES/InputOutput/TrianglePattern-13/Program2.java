class Pattern2{
	public static void main(String[] args){

		int num=2;
		for(int i=1; i<=5; i++){
			for(int j=i; j<=5; j++){
				System.out.print(num + " ");
				num += 2;
				
			}
			System.out.println();
		}
	}
}
