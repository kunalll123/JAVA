class Pattern7{
	public static void main(String[] args){

		int rows=4;

		for(int i=1; i<=rows; i++){
			int num=rows-i+1;
			for(int j=1; j<=rows-i+1; j++){

				if(j%2 == 0){
					System.out.print((char)(num+96) + " ");
				}else{
					System.out.print(num + " ");
				}
				num--;
			}
			System.out.println();
		}
	}
}
