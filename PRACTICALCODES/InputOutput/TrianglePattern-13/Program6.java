class Pattern6{
	public static void main(String[] args){

		int row=4;
		int num=4;
		char ch=99;	
		for(int i=1; i<=row; i++){
	
			for(int j=row; row>=1; j--){
				if(j%2 != 0){
				System.out.print(num-- + " ");
				
				}else{
					System.out.print(ch-- + " ");
					
				}
				
			}
			System.out.println();
		}
	}
}

