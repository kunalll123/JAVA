class Pattern6{
	public static void main(String[] args){

		int row=4;
		
	
		for(int i=1; i<=row; i++){
				
			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");
			}

			int num=row;

			for(int j=1; j<=i*2-1; j++){
				if(j>=i){
				System.out.print(num++ + "\t");
			}else{
				System.out.print(num-- + "\t");
			}
			}
			
			System.out.println();
		}
	}
}


