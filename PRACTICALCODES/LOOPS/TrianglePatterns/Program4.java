class Pattern4{
	public static void main(String[] args){

		
		int row=3;

		
		for(int i=3; i>0; i--){
			for(int j=3; j>=i; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
