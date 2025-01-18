class Pattern9{
	public static void main(String[] args){

		int row=4;
		
	

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<=row-i; sp++){
				
				System.out.print(" "+"\t");
			}
		
			char ch1=65;
			char ch2=97;

			for(int j=1; j<=i*2-1; j++){
				if(j>=i){
					System.out.print(ch1++ + "\t");
				}else{
					System.out.print(ch2-- + "\t");
				}
			}
			System.out.println();
		}
	}
}
