class Pattern2{
	public static void main(String[] args){

		int rows=4;
		
		for(int i=1; i<=rows; i++){
			char ch='a';
			for(int j=1; j<=i; j++){
				if(i % 2==1){
					System.out.print((ch++) + " ");
				}else{
					System.out.print("$  ");
				}
			}
			System.out.println();
		}
	}
}	

