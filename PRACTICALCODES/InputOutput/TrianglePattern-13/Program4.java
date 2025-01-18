class Pattern4{
	public static void main(String[] args){

		char ch='F';
		for(int i=1; i<=3; i++){
			for(int j=i; j<=3; j++){
				System.out.print(ch-- + " ");
				
			}
			System.out.println();
		}
	}
}

