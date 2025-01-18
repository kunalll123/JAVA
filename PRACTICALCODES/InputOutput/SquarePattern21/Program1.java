class Pattern1{
	public static void main(String[] args){

		int row=4;
		

		for(int i=1; i<=row; i++){
		char ch=68;
		int num=row;
		for(int j=1; j<=row; j++){
				if(i%2 == 0){
					System.out.print(num + " ");
				}else{
					System.out.print(ch-- + " ");
			}
			}
			System.out.println();
		}
	}
}
