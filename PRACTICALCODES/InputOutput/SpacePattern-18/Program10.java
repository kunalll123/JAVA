class Pattern10{
	public static void main(String[] args){

		int rows=4;
		int num=65;

		for(int i=0; i<rows; i++){

			for(int sp=0; sp<i; sp++){

				System.out.print(" "+"\t");
			}

			for(int j=0; j<rows-i; j++){
				if(j == 0){
					System.out.print(num  + "\t");
				}else{
				System.out.print((char)(num++) +"\t");
			}
			}
			System.out.println();
			num=65+i+2;
		}
	}
}
