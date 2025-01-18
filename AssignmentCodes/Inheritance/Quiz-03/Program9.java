class Demo{
	static int numSqr(int num){
		return num*num;
	}
	int numCube(int num){
		return num*num*num;
	}
}

class Main extends Demo{

	static int numSqr(int num){
		return num*num;
	}
	int numCube(int num){
		int cube=num*num*num;

		System.out.println(cube);
		return 1;
	}
	public static void main(String[] args){

		Demo obj=new Main();

		System.out.println(obj.numCube(5));
		System.out.println(obj.numSqr(5));
	}
}
