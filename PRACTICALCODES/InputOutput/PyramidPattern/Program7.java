class Pattern7{
	public static void main(String[] args){

		int row=4;
		
		int num=1;
		char ch=65;

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");
			}
			

			for(int j=1; j<=i*2-1; j++){
				if(i % 2 == 1){
					System.out.print(num + "\t");
				}else{
					System.out.print(ch + "\t");
				}
			}
			System.out.println();
			num++;
			ch++;
		}
	}
}
